package main;

import java.util.concurrent.TimeUnit;

import main.appModule.Unthink;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Setup{

	public static WebDriver driver;
	public static String SUT;
	
	@BeforeClass
	public static void suiteSetup(){
		System.out.println("Suite setup. Setting up browser");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		SUT = "https://unthink.sharepoint.com/";
		
		driver.get(SUT);
		
		Unthink.login(driver, SUT);
	
		
	
	
	}
	
	@Before
	public void testSetUp(){
		
		System.out.println("*** Setting up test ***");
		driver.get(SUT);
	}
	
	@After
	public void testTearDown(){
		System.out.println("*** Quitting test ***");
	}
	
	@AfterClass
	public static void suiteTearDown(){
		driver.quit();
		System.out.println("Suite teardown. Quitting browser");
	}
	
	
}
