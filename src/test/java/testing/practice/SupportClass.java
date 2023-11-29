package testing.practice;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SupportClass extends BaseClass{

	@Test
	public void Test_TC_001() {
		
		driver.get("https://www.google.com/");
	}
	@Test
	public void Test_TC_002() {
		
		driver.get("https://www.flipkart.com/");
		
	}
	@Test
	public void Test_TC_003() {
		
		driver.get("https://www.facebook.com/login/");
		
	
}
}