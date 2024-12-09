package pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.ProjectHooks;
import config.ConfigurationManager;

public class BasePage extends ProjectHooks{
	
	@BeforeMethod
	public void setup() {
		new LoginPage()
        .enterUsername(ConfigurationManager.configuration().userName())
        .enterPassword(ConfigurationManager.configuration().password())
        .clickLogin()
        .clickCrmsfa()
        .clickLeadsTab();
	}
	
	@AfterMethod
	public void tearDown() {
		new HomePage()
		.clickOpentaps()
		.clickLogout();
	}

}
