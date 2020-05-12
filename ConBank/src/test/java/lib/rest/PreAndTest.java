package lib.rest;


import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.restassured.RestAssured;
import lib.utils.DataInputProvider;
import lib.utils.HTMLReporter;

public class PreAndTest extends HTMLReporter{
	
	public String dataFileName, dataFileType;	
	
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeClass
	public void beforeClass() {
		startTestCase(testCaseName, testDescription);		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		//for reports		
		svcTest = startTestModule(nodes);
		svcTest.assignAuthor(authors);
		svcTest.assignCategory(category);
		
		if(category.equals("addTestsToCycle"))
			RestAssured.baseURI = "https://jira.tagitmobile.com/rest/zapi/latest/execution/addTestsToCycle";
			else if(category.equals("CreateCycle"))
			RestAssured.baseURI = "https://jira.tagitmobile.com/rest/zapi/latest/cycle";
	}
	@AfterMethod
	public void afterMethod() {
	}

	@AfterSuite
	public void afterSuite() {
		//endResult();
	}

	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		if(dataFileType.equalsIgnoreCase("Excel"))
			return DataInputProvider.getSheet0(dataFileName);	
		else {
			Object[][] data = new Object[1][1];
			data[0][0] = new File("./data/"+dataFileName+"."+dataFileType);
			System.out.println(data[0][0]);
			return data;
		}
			
	}

	@Override
	public long takeSnap() {
		return 0;
	}	

	
	
}
