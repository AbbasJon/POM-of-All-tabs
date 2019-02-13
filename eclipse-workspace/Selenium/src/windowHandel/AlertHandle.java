package windowHandel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AlertHandle {

	@Test
	void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		//you can get the text
		System.out.print(alert.getText());
		
		//Now you have to accept the alert by using following method
		
		alert.accept();
		
		//if there is an option to cancel the alert, the method is 
		
		alert.dismiss();
		
		Thread.sleep(3000);
		
		 
	}
	
}
