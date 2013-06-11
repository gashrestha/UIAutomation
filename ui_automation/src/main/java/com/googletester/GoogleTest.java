/**
 * 
 */
package com.googletester;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author i80405
 *
 */
public class GoogleTest {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http:\\google.com");
		Assert.assertTrue("Google",driver.getTitle().startsWith("Google"));
		driver.quit();		
	}

}
