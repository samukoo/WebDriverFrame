package main.testlogic;

import main.Setup;
import main.appModule.UnthinkHome;
import main.appModule.UnthinkNavigation;

import org.openqa.selenium.WebDriver;

public class UnthinkHomeTestLogic extends Setup {

	public static Boolean unthinkNaviTest(WebDriver driver){
		
		UnthinkNavigation.openHRblog(driver);

		if(driver.getTitle().equals(new String("Home - HR Blog")))
			return true;
		return false;
	}

	public static boolean openTasks(WebDriver driver) {
		
		UnthinkNavigation.openTasks(driver);

		if(driver.getCurrentUrl().contains("outlook.office365.com"))
			return true;
		return false;
	}

	public static boolean openSales(WebDriver driver) {
		
		UnthinkNavigation.openSalesPage(driver);
		
		if(driver.getTitle().equals(new String("HiQ Sales Team - Home")))
			return true;
		return false;
	}

	public static boolean searchContent(WebDriver driver, String search){
		
		UnthinkHome.createSearch(driver, search);
		
		if(driver.getTitle().equals(new String("Search: Kierrätys")))
			return true;
		return false;	
	}



}
