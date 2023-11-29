package testing.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.nio.file.spi.FileSystemProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 {
  @Test 
  public void tc_002() {
	  System.out.println("Tes case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Class");
	  
  } 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
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
	  System.out.println("Bfore class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("afterTest");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");

  }

}
