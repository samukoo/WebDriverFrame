package main.utilities;

import org.openqa.selenium.By;

public class LocatorProperties {

	public static String getLocator(String locator){
		return new PropsLoader("locator.properties").loadProperties().getProperty(locator);
	}
}
