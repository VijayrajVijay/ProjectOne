package testing.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {

	@Test 
	  public void TC_001() {
		  System.out.println("Test Case:1");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Afer Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After Class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Before Suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After Suite");
	  }
	  
		@Test (priority=2)
		  public void TC_002() {
			  System.out.println("Test Case:2");
		  }

		@Test  (priority=3)
		  public void TC_003() {
			  System.out.println("Test Case:3");
		  }
	}

