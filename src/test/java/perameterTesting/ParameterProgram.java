package perameterTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProgram {
	
	
	@Test
    @Parameters ("eName")
	public void loginCrendential(String na) {
		System.out.println("Parameter data provided:" + na );
		
	}

}
