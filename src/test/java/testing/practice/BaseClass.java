package testing.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void chromeBrowsarLaunch() {
		
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	@AfterMethod
    public void shutDown() {
    	driver.close();
}
}
