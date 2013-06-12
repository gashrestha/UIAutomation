/**
 * 
 */
package com.google.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

/**
 * @author i80405
 *
 */
public class GoogleTest {

	@Test
	public void test() {
		WebDriver driver = new AndroidDriver();
		driver.navigate().to("http:\\google.com");
		Assert.assertTrue("Google",driver.getTitle().startsWith("Google"));
		driver.quit();		
	}
}
