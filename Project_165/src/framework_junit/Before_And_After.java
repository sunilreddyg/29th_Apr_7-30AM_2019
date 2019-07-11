package framework_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After {

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("after");
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
