package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewtestNgclass {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	

	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("aftereclass");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
