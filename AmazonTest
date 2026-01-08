package testNGsession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
  
	@Test 
	public void amazomTitleTest() {
		String actucaltitle = driver.getTitle();
		System.out.println("Title is " + actucaltitle);
		Assert.assertTrue(actucaltitle.contains( "Shopping site in India"));
	}
	
	@Test 
	public void amazonURLTest() {
		String actucalURL = driver.getCurrentUrl();
		Assert.assertTrue(actucalURL.contains( "amazon"));
		System.out.println("URL is " + actucalURL);
	}
}
