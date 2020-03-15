package org.cheapOair.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.dataReader.com.ReadDataFromXL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pageObject.com.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage_StepDefinition {
	
	WebDriver driver;
	HomePage homePage;
	
	
	public HomePage_StepDefinition(ServiceHooks hooks) {
		homePage = new HomePage(hooks.baseClass.driver);
	}
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		homePage.VerifyUserIsOnCorrectPage();
	}

	@Then("Select OneWay")
	public void select_OneWay() throws Exception{
	   homePage.clickOnOneWay();
	}

	@Then("Select depart date")
	public void select_depart_date() throws Exception {
		String[][] data = ReadDataFromXL.readData(2);
		homePage.enterDepartDate(data[1][0].toString());
	}

	@Then("Click on search button")
	public void click_on_search_button() {
		
	}

	@Then("Listing page should load")
	public void listing_page_should_load() {
	   
	}

	@Then("Select RoundTrip")
	public void select_RoundTrip() {
		
	}
	
	@Then("Enter fromCity")
	public void enter_fromCity(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<String> cityName = dataTable.asList(String.class);
		System.out.println("City name is = " + cityName);
	}
	
	@Then("Enter to city {string}")
	public void enter_to_city(String toCity) throws Exception {
	   System.out.println("To city is = " + toCity);
	   homePage.enterToCity(toCity);
	}
}
