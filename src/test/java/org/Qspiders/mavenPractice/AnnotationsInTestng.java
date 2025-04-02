package org.Qspiders.mavenPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestng {
	
	
	@Test
	public void m1()
	{
		System.out.println("This is method1");
	}
	
	@Test
	public void m2()
	{
		System.out.println("This is method2");
	}
	
	
	@Test
	public void m3()
	{
		System.out.println("This is method3");
	}
	
	@BeforeMethod
	public void before()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("after method");
		//driver.quit();
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}
}
