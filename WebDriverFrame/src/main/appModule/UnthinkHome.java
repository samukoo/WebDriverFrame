package main.appModule;

import main.pagemodel.Home;

import org.openqa.selenium.WebDriver;

public class UnthinkHome{

	public static void createSearch(WebDriver driver, String search){
		
		Home.getSearchBar(driver).sendKeys(search);
		Home.getSubmitButton(driver).click();
		
	}
	
	
	
}
