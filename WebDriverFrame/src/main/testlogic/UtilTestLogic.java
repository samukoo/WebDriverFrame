package main.testlogic;

import main.utilities.LocatorProperties;
import main.utilities.UserProperties;

import org.openqa.selenium.By;

public class UtilTestLogic {

	public static String getUserName(){
		UserProperties userProps = new UserProperties();
		return userProps.getUser().getName();
	}

	public static String getLocatorProps(String search) {

		return LocatorProperties.getLocator(search);
		
	}
	
	
	
}
