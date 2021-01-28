package test;

import org.testng.annotations.Test;

public class CLASS1 {
	@Test(groups= {"Smoke"})
	
	public void Demo ()
	{
		System.out.println("Demo");
	}
	@Test
	public void real ()
	{
		System.out.println("real");

	}

}
