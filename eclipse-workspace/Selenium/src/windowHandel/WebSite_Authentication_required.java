package windowHandel;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WebSite_Authentication_required {

	@Test
	void PopUpTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//before the domain name, you have to pass the userName and Password (credentials)
		//as like http://UserName:Password@ then the URL
		//As shown below admin:admin@.....
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		String pagemessage = driver.findElement(By.cssSelector("p")).getText();
	
		System.out.println(pagemessage);
	}

}