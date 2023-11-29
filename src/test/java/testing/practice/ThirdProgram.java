package testing.practice;

import org.testng.annotations.Test;

public class ThirdProgram {
	
	
	@Test (priority=1, enabled=false)
	public void openBrowsar() {
		System.out.println("Open Browsar");
	}

	@Test(priority=2)
	public void test2() {
		System.out.println("Take Screenshot");
		
		
}
	@Test (dependsOnMethods = "test2")
	public void fileTransfer() {
		System.out.println("Transfer the File");
		
		
	
}
	@Test (priority=4)
	public void test3() {
		System.out.println("Close the Browsar");
}
}