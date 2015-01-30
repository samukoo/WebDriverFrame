package main.appModule;

import main.pagemodel.LoginPage;
import main.utilities.UserProperties;

import org.openqa.selenium.WebDriver;

public class Unthink{

		private static UserProperties userProps = new UserProperties();
	
	public static void login(WebDriver driver, String SUT) {
		
		driver.get(SUT);	//Avataan unthink login
		
		LoginPage.getLoginCredentialContainer(driver).sendKeys(userProps.getUser().getName());	//syötä user
		LoginPage.getSubmitButton(driver).click();	//klikkaa submittia, ohjaa yrityksen omalle loginille
		LoginPage.getCompanyPasswordCredentialContainer(driver).sendKeys(userProps.getUser().getPass());	//Syötä pass
		LoginPage.getCompanySubmitButton(driver).click();	//klikkaa submit
		System.out.println("landing to: " + driver.getCurrentUrl());	//totea etusivu
	}
	
	
	
	
}
