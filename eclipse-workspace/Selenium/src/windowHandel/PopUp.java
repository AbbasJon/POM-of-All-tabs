package windowHandel;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class PopUp {

	@Test
	void PopUpTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.online.citibank.co.in/");

	}

}