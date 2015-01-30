package main.testcases;

import static org.testng.Assert.assertEquals;
import main.Setup;
import main.testlogic.UtilTestLogic;

import org.junit.Test;



public class UtilTestFixture extends Setup {

	@Test
	public void loadUserPropertiesTest(){
		assertEquals(UtilTestLogic.getUserName(), "sauli.kotisaari@hiq.fi");
	}
	
	@Test
	public void loadLocatorProps(){
		assertEquals(UtilTestLogic.getLocatorProps("login.credentialInput").toString(), "cred_userid_inputtext");
	}
	
}
