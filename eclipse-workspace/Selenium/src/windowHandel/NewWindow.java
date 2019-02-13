package windowHandel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class NewWindow {

	@Test
	void test1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("xpath")).click();
	
		String BaseWindow = driver.getWindowHandle();
		
		for (String Subwindow : driver.getWindowHandles())
		{
			driver.switchTo().window(Subwindow);
			//It will switch to new window 
			       
		}
		
		//perform any operation there 
        System.out.println(driver.findElement(By.xpath("//div[@class='bold']")).getText());
        
        driver.close();
        
        //it will close the sub window and to come back to Basewindow, use the following command
			
        driver.switchTo().window(BaseWindow);
        
        driver.close();
	}
	
}
