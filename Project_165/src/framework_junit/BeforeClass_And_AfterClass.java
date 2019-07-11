package framework_junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("after class");
	}

	@Test //Invoke method execution without object creation
	public void test() 
	{
		System.out.println("test executed");
	}

	@Test//Invoke method execution without object creation
	public void test2() 
	{
		System.out.println("test2 executed");
	}

	@Test//Invoke method execution without object creation
	public void test3() 
	{
		System.out.println("test3 executed");
	}

}
