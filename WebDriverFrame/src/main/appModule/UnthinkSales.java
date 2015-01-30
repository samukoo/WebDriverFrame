package main.appModule;

import main.pagemodel.Sales;

import org.openqa.selenium.WebDriver;

public class UnthinkSales {

	public static void openHorizontalMenu(WebDriver driver){
		
		Sales.getHorizontalToolMenu(driver).click();
	}
	
	public static void openViewAllPages(WebDriver driver){
		
		Sales.getViewAllPages(driver).click();
	}
	
	
	
}
