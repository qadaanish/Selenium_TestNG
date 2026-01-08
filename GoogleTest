package testNGsession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	@Test 
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		Assert.assertEquals(title,"Google");
	}
	
	@Test
	public void googletURLTest() {
		String actucalURL = driver.getCurrentUrl();
		System.out.println("URL is " +   actucalURL);
		Assert.assertTrue(actucalURL.contains("google"));
	}
	
	
}
