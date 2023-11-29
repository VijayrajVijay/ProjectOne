package testing.practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {	

                                                                      
	@Test
	public void hardAssert() {
		
		String aExpectedResult = "Java";
		String bActualResult = "Selenium";
		
		System.out.println("Assert is going to Start");
		
		//org.testng.Assert.assertEquals(bActualResult, aExpectedResult,"Its Not Equal:(");
		org.testng.Assert.assertNotEquals(aExpectedResult, bActualResult,"Its Not Equal:(");
		System.out.println("End Of The Program");
         	
	}
		
	@Test
	public void SoftAssert() {
	
		String s1 = "TestNG";
		String s2 = "Cucumber";
		
		System.out.println("Assert is going to Start");
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(s1,s2 , "Its Not Equal:(");
		//s.assertAll();
		
		System.out.println("End Of The Program");
		
	}
	
		
	}
	
	


