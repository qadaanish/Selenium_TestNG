package testNGsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected WebDriver driver;
	
	@Parameters({"url", "browser"})
	@BeforeClass
	public void setUp(String url, String browserName) {
		
		 switch (browserName.toLowerCase()) {  
         case "chrome":
             driver = new ChromeDriver();
             break;

         case "firefox":
             driver = new FirefoxDriver();
             break;

         case "edge":
             driver = new EdgeDriver();
             break;

         default:
             throw new IllegalArgumentException("Browser not supported: " + browserName);
     }
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(url);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	
	@AfterClass
	public void testDown() {
		driver.quit();
	}
}
