package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class executionDemo {

	
	@Parameters({"browser"})
	@Test
	public void doSomething(String browser) {
		System.out.println("Parameters passed as: "+browser);
	}
}
