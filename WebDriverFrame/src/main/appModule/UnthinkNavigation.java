package main.appModule;

import main.pagemodel.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import fi.hiq.qa.QACommonUtils.QACommonSelenium;

public class UnthinkNavigation {

	private static final String HRTitle = "Home - HR Blog";
	private static final String SalesTitle = "HiQ Sales Team - Home";
	
	public static void openTasks(WebDriver driver){
		
		Home.getToolbarNavi(driver).click();
		Home.getTasksButton(driver).click();
	}

	public static void openHRblog(WebDriver driver){
		
		Home.getHRblogLink(driver).click();
		QACommonSelenium.waitUntilTitleIs(driver, HRTitle, 30);
	}

	public static void openSalesPage(WebDriver driver) {
		
		Actions actions = new Actions(driver);
		WebElement menuHoover = Home.getTeamMenu(driver);
		actions.moveToElement(menuHoover);
		actions.perform();
		
		Home.getSalesLink(driver).click();
		QACommonSelenium.waitUntilTitleIs(driver, SalesTitle, 30);
	}
}
