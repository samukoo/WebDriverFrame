package main.pagemodel;

import main.utilities.LocatorProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fi.hiq.qa.QACommonUtils.QACommonSelenium;

public class MarketingMaterials {

	private static final String ServiceConceptLink =LocatorProperties.getLocator("marketing.ServiceConceptLink");
	
	public static WebElement getServiceConceptLink(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, ServiceConceptLink);
		return driver.findElement(By.id(ServiceConceptLink));
	}
	
	public static WebElement getLink(WebDriver driver, String link){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, link);
		return driver.findElement(By.linkText(link));
	}
	
	
}
