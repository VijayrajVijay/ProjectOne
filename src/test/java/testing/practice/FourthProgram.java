package testing.practice;

import org.testng.annotations.Test;

public class FourthProgram {
	
	@Test (priority=2)
	public void bowserLounch() {
		System.out.println("Launchig the Browser");
	}
	@Test (priority=1)
	public void loadingUrl() {
		System.out.println("Loading URL");
	}

}
