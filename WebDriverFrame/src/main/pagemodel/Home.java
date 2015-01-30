package main.pagemodel;

import main.utilities.LocatorProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fi.hiq.qa.QACommonUtils.QACommonSelenium;

public class Home {

	private final static String taskButton = LocatorProperties.getLocator("home.taskButton");
	private final static String HRblogLink = LocatorProperties.getLocator("home.HRblogLink");
	private final static String ToolbarNavi = LocatorProperties.getLocator("home.ToolbarNavi");
	private final static String TeamMenu = LocatorProperties.getLocator("home.TeamMenu");
	private final static String SalesLink = LocatorProperties.getLocator("home.SalesLink");
	private final static String SearchBar = LocatorProperties.getLocator("home.SearchBar");
	private final static String SubmitButton = LocatorProperties.getLocator("home.SubmitButton");
	
	public static WebElement getHRblogLink(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, HRblogLink);
		return driver.findElement(By.xpath(HRblogLink));
	}

	public static WebElement getToolbarNavi(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, ToolbarNavi);
		return driver.findElement(By.id(ToolbarNavi));
	}

	public static WebElement getTasksButton(WebDriver driver) {
		QACommonSelenium.waitUntilElementIsDisplayed(driver, taskButton);
		return driver.findElement(By.xpath(taskButton));
	}

	public static WebElement getTeamMenu(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, TeamMenu);
		return driver.findElement(By.xpath(TeamMenu));
	}
	
	public static WebElement getSalesLink(WebDriver driver) {
		QACommonSelenium.waitUntilElementIsDisplayed(driver, SalesLink);
		return driver.findElement(By.xpath(SalesLink));
	}
	
	public static WebElement getSearchBar(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, SearchBar);
		return driver.findElement(By.id(SearchBar));
	}
	
	public static WebElement getSubmitButton(WebDriver driver){
		QACommonSelenium.waitUntilElementIsDisplayed(driver, SubmitButton);
		return driver.findElement(By.xpath(SubmitButton));
	}
	
}
