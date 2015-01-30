package main.testcases;

import main.Setup;
import main.testlogic.UnthinkHomeTestLogic;
import main.testlogic.UnthinkSalesTestLogic;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;


@RunWith(ConcordionRunner.class)
public class NavigationFixture extends Setup {

	private String search ="Kierrätys";
	
	
	public String openHRblog(){
		return UnthinkHomeTestLogic.unthinkNaviTest(driver)?"voi avata":"ei voi avata";
	}
	
	
	public String openTasks(){
		return UnthinkHomeTestLogic.openTasks(driver)?"TodoTrue":"TodoFalse";
	}
	
	
	public String openSalesSite(){
		return UnthinkHomeTestLogic.openSales(driver)?"TodoTrue":"TodoFalse";
	}
	
	
	public String searchFunctionality(){
		return UnthinkHomeTestLogic.searchContent(driver, search)?"TodoTrue":"TodoFalse";
	}
	
	
	public String viewAllPages(){
		return UnthinkSalesTestLogic.showAllPAges()?"TodoTrue":"TodoFalse";
	}
	
	
}
