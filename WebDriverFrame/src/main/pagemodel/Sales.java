package main.pagemodel;

import main.utilities.LocatorProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fi.hiq.qa.QACommonUtils.QACommonSelenium;

public class Sales {

	private final static String HorizontalToolMenu = LocatorProperties.getLocator("sales.HorizontalToolMenu");
	private final static String ViewAllPages = LocatorProperties.getLocator("sales.ViewAllPages");
	private final static String MarketinMaterialLink = LocatorProperties.getLocator("sales.MarketinMaterialLink");
	
	
	public static WebElement getHorizontalToolMenu(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, HorizontalToolMenu);
		return driver.findElement(By.xpath(HorizontalToolMenu));
		
	}
	
	public static WebElement getViewAllPages(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, ViewAllPages);
		return driver.findElement(By.xpath(ViewAllPages));
	}
	
	public static WebElement getMarketinMaterialLink(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, MarketinMaterialLink);
		return driver.findElement(By.xpath(MarketinMaterialLink));	}
	
	
}
