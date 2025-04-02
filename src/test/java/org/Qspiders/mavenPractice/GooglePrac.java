package org.Qspiders.mavenPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.Listener.ListenerClass.class)
public class GooglePrac extends BaseClass{

	
	@Test
	public void testGoogle1()
	{
		setUp();
		
		Assert.assertTrue(false);
		
	}
	
	
}
