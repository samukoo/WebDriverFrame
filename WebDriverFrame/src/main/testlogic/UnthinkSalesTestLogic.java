package main.testlogic;

import main.Setup;
import main.appModule.UnthinkNavigation;
import main.appModule.UnthinkSales;
import main.pagemodel.MarketingMaterials;
import main.pagemodel.Sales;

public class UnthinkSalesTestLogic extends Setup{

	public static Boolean showAllPAges(){
		
		
		UnthinkNavigation.openSalesPage(driver);
		UnthinkSales.openHorizontalMenu(driver);
		UnthinkSales.openViewAllPages(driver);
		
		if(driver.getTitle().equals(new String("Site Pages - All Pages")))
			return true;
		return false;
	}

	public static boolean openServicePPT() {
		
		UnthinkNavigation.openSalesPage(driver);
		Sales.getMarketinMaterialLink(driver).click();
		MarketingMaterials.getServiceConceptLink(driver).click();
		
		MarketingMaterials.getLink(driver, "HiQ__TYOSTÄ_UNELMAA_2014").click();
		
		return false;
	}
	
	
	
}
