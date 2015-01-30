package main.pagemodel;

import main.utilities.LocatorProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fi.hiq.qa.QACommonUtils.QACommonSelenium;

public class LoginPage {
	
	private static String byCredentialInput = LocatorProperties.getLocator("login.credentialInput");
	private static String byCredentialSignInButton = LocatorProperties.getLocator("login.credentialSignInButton");
	private static String byPasswordInput =  LocatorProperties.getLocator("login.passwordInput");
	private static String bySubmitButton = LocatorProperties.getLocator("login.submitButton");
	
	public static WebElement getLoginCredentialContainer(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, byCredentialInput);
		return driver.findElement(By.id(byCredentialInput));
	}
	
	public static WebElement getSubmitButton(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, byCredentialSignInButton);
		return driver.findElement(By.id(byCredentialSignInButton));
	}
	
	public static WebElement getCompanyPasswordCredentialContainer(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, byPasswordInput);
		return driver.findElement(By.id(byPasswordInput));
	}
	
	public static WebElement getCompanySubmitButton(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, bySubmitButton);
		return driver.findElement(By.id(bySubmitButton));
	}
	
}
