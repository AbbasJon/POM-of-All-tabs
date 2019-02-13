package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("This is before class method");
	}
 
	@Test (groups = {"car", "Sedan"})
	public void Corola() {
		
		System.out.println("This is Carola group");
	}

	@Test(groups = {"car", "Sedan"})
	public void MBW() {
		
		System.out.println("This is BMW group");
	}
	
	@Test(groups = {"car","SUV"})
	public void Rogue() {
		
		System.out.println("This is Rogue group");
	}
	
	@Test (groups = {"car","SUV"})
	public void MDX() {
		
		System.out.println("This is MDX group");
	}
	
	@Test(groups= {"bikes", "motorcycle"})
	public void motocycle() {
		
		System.out.println("This is Bikes groups");
	}
	
	@Test(groups = {"bikes","motorbike"})
	public void Scooter() {
		
		System.out.println("This is scooter method");
	}
	
	@Test(groups = {"bikes","bicycle"})
	public void Cycle() {
		
		System.out.println("This is cyle method");
	}
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("This is after class method");
	}
 

}
