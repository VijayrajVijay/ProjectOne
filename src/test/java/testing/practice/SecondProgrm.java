package testing.practice;

import org.testng.annotations.Test;

public class SecondProgrm {
   @Test (priority = 1)
	public void browserlaunch() {
		
		System.out.println("Launching the browser");
		
	}
   @Test (priority = 2)
    public void loadingURL() {
		
		System.out.println("LoadingURL the URL"); 
		
	}
   @Test (priority = 3)
    public void maximizeWindow() {
	
	System.out.println("Maximize the Window");
	
}
   @Test (priority = 4)   
    public void verifyingApliction() {
		
		System.out.println("Verifying the web Apliction");
		
	}
   @Test (priority = 5,  enabled = false )
    public void takeScreendhot() {
		
		System.out.println("Taking Screendhot");
		
	}
   @Test (priority = 6)
    public void fileTransfer() {
		
		System.out.println("Transfering the files form temp to perm");
		
	}
   @Test (priority = 7)
    public void shutDown() {
		
		System.out.println("Closing the browser");
		
	}
}
