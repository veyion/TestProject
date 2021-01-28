package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class covid {
	@Test
	
	public static void main (String [] args) {
		
	}
	
	public void d ()
	{
		System.out.println("Hello");
	}
	@Test(groups= {"Smoke"})

	public void rr ()
	{
		int i = 3;
		System.out.println(i);
		
	}

	@BeforeTest
	public void kys ()
	{
		System.out.println("Kys");

	}
}
