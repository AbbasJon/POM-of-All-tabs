package windowHandel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class NewWindow {

	@Test
	void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath(".//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
		
		Thread.sleep(3000);
		
		String BaseWindow = driver.getWindowHandle();
		
		for (String Subwindow : driver.getWindowHandles())
		{
			driver.switchTo().window(Subwindow);
			//It will switch to new window 
			       
		}
		
		//perform any operation there 
        System.out.println(driver.findElement(By.xpath(".//*[@id='main-wrapper']/div/div[2]/div[2]/div[1]/div/div[1]/h1")).getText());
         
        Thread.sleep(3000);
        
        driver.close();
        
        //it will close the sub window and to come back to Basewindow, use the following command
			
        driver.switchTo().window(BaseWindow);
        
        driver.findElement(By.xpath(".//*[@id='container']/div[2]/div[2]/div/div[1]/div[5]/div/div")).click();
        
        Thread.sleep(3000);
        driver.close();
	}
	
}
