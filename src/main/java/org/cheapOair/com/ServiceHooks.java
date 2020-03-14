package org.cheapOair.com;


import baseClass.BaseClass;
import baseClass.Browser;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {

	public BaseClass baseClass;

	@Before
	public void atBefore(Scenario scenario) throws Exception {
		System.out.println("Scenario = " + scenario.getName() + " is start executed.");
		
		baseClass = new BaseClass();
		//baseClass.selectBrowser("firefox");
		//baseClass.selectBrowser(Browser.CHROME.toString());
		baseClass.selectBrowser(Browser.FIREFOX.toString());
	}
	
	
	@After
	public void atAfter(Scenario scdenario) {
		baseClass.closeBrowser();
	}
}
