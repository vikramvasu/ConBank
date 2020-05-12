package utils;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

public class JiraApiRequests {

	public static MediaType mediaType = MediaType.parse("application/json");
	public static OkHttpClient client = new OkHttpClient();
	public static JSONObject Test;
	public static int maximumResult = 1000;
	static JSONArray output;
	public static String UserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36";
	public static String AcceptTypeHTML = "text/html,application/xhtml+xml,q=0.9,image/webp,image/apng,*/*;q=0.8";
	public static String AcceptTypeJSON = "applictation/json,text/javascript,*/*;q=0.01";
	public static String AcceptLanguage = "en-US,en;q=0.9";
	public static String xElasticaGw = "2.43.0";
	public static String username = "jabrulla.khan@tagitmobile.com", password = "Jaffar3110^^";
	public static String TagitJiraURL = "https://jira.tagitmobile.com/";

	public static Response clientExecute(Request request) throws IOException {
		return client.newCall(request).execute();
	}

	public static String getToken() throws IOException {

		System.out.println(encode(username, password));

		Response resp = clientExecute(new Request.Builder().url("https://jira.tagitmobile.com/secure/Dashboard.jspa")
				.get().addHeader("Connection", "keep-alive").addHeader("Cache-Control", "max-age=0")
				.addHeader("Upgrade-Insecure-Requests", "1")
				.addHeader("User-Agent",
						"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36")
				.addHeader("Accept",
						"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
				.addHeader("Accept-Language", "en-US,en;q=0.9").addHeader("cache-control", "no-cache").build());

		return resp.body().string().toString().split("var zEncKeyVal = \"")[1].substring(0, 88);
	}

	public static String encode(String username, String password) {
		return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
	}

	public static void updateTestStatus(String projectKey, String versionName, String cycleName, JSONObject Tests,
			String status) throws IOException {
		System.out.println(Tests.getInt("id"));
		Response resp = clientExecute(new Request.Builder()
				.url(TagitJiraURL + "rest/zephyr/latest/execution/" + Tests.getInt("id") + "/execute")
				.put(RequestBody.create(mediaType,
						"{\"status\":\"" + getStatus(status) + "\",\"changeAssignee\":false}"))
				.addHeader("AO-7DEABF", getToken()).addHeader("origin", TagitJiraURL)
				.addHeader("Accept-Language", AcceptLanguage).addHeader("User-Agent", UserAgent)
				.addHeader("Content-Type", "application/json").addHeader("Accept", AcceptTypeJSON)
				.addHeader("Referer",
						TagitJiraURL + "project/" + projectKey + "?&versionId=" + Tests.getInt("versionId")
								+ "&cycleId=" + Tests.getInt("cycleId")
								+ "&selectedItem=com.thed.zephyr.je%3Azephyr-tests-page")
				.addHeader("X-Requested-With", "XMLHttpRequest").addHeader("Connection", "keep-alive")
				.addHeader("Cache-Control", "no-cache").addHeader("Authorization", encode(username, password)).build());
		
		System.out.println(resp.body().string());
		resp.body().close();

	}

	private static String getStatus(String status) {
		switch (status) {
		case "pass":
			return "1";
		case "fail":
			return "2";
		case "wip":
			return "3";
		case "blocked":
			return "4";
		case "unexecuted":
			return "-1";
		default:
			return "-1";

		}
	}

	public static JSONArray getTests(String projectKey, String versionName, String cycleName) throws IOException {
		JSONObject jsonObj;
		JSONArray arr;
		String url = "https://jira.tagitmobile.com/rest/zephyr/latest/zql/executeSearch/?zqlQuery=project='"
				+ projectKey + "' AND fixVersion ='" + versionName + "' AND CycleName in ('" + cycleName
				+ "')&maxRecords=" + maximumResult + "";
		Response response = clientExecute(new Request.Builder().url(url).get()
				.addHeader("accept", "application/json, text/javascript, */*; q=0.01")
				.addHeader("x-requested-with", "XMLHttpRequest")
				.addHeader("user-agent",
						"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36")
				.addHeader("AO-7DEABF", getToken()).addHeader("content-type", "application/json")
				.addHeader("cache-control", "no-cache").addHeader("Authorization", encode(username, password)).build());
		try {
			// System.out.println(response.body().string());
			jsonObj = new JSONObject(response.body().string());
			System.out.println(jsonObj.toString());
			arr = (JSONArray) jsonObj.get("executions");
			System.out.println("Done");
		} finally {
			response.body().close();
		}
		return arr;
	}

	public static void updateJiraStatus(String projectKey, String versionName, String cycleName, String filename)
			throws IOException {
		Document htmlFile = null;
		JSONObject nowTest = null;
		try {
			htmlFile = Jsoup.parse(new File("./reports/" + filename + ".html"), "ISO-8859-1");

		} catch (IOException e) {
			e.printStackTrace();
		}
		HashMap<String, JSONObject> testmap = new HashMap<String, JSONObject>();

		JSONArray result = getTests(projectKey, versionName, cycleName);
		for (int i = 0; i < result.length(); i++) {
			nowTest = (JSONObject) result.get(i);
			JSONObject status = (JSONObject) nowTest.get("status");
			nowTest.remove("status");
			nowTest.put("status", status.get("name"));
			testmap.put((String) nowTest.get("issueKey"), nowTest);

		}
		
		for (Element now : htmlFile.getElementsByAttributeValue("class", "test-head")) {
			Elements TestName = now.getElementsByAttributeValue("class", "test-name");
			if (testmap.get(TestName.text()) != null) {
				updateTestStatus(projectKey, versionName, cycleName, testmap.get(TestName.text()),
						TestName.next().text());
				System.out.println(testmap.get(TestName.text()).get("issueKey") + "-Found&Updated.");
			} else {
				System.out.println(testmap.get(TestName.text()).get("issueKey") + "-Not Found.");
			}
		}
	}

	public static void updateJiraCycleStatus(String projectKey, String versionName, String cycleName, String Ustatus)
			throws IOException {

		JSONObject nowTest = null;
		JSONArray result = getTests(projectKey, versionName, cycleName);

		System.out.println("well");
		for (int i = 0; i < result.length(); i++) {
			nowTest = (JSONObject) result.get(i);
			JSONObject status = (JSONObject) nowTest.get("status");

			nowTest.remove("status");

			nowTest.put("status", status.get("name"));
			System.out.println(nowTest.get("issueKey"));
			updateTestStatus(projectKey, versionName, cycleName, nowTest, Ustatus);
		}

	}
}
