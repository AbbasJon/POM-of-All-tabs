package testNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	WebDriver driver;
	@Test
	@Parameters ("Broswers")
	public void OpenBrowser (String browsername) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedrive.exe");
	
	     driver = new ChromeDriver();
	  
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	 driver.get("http://opensource.demo.orangehrmlive.com/");
	     Thread.sleep(3000);
		
	}
}
