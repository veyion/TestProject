package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Other {
	@Test
	
	
	
	public void d ()
	{
		System.out.println("Hegtllo");
	}
	@Test
	public void rr ()
	{
		System.out.println("rr");

	}

	@BeforeMethod
	public void Before ()
	{
		System.out.println("12333");

	}
	
	@BeforeSuite
	public void BeforeS ()
	{
		System.out.println("jddjjdjd");

	}
	
}

