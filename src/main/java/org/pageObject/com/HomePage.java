package org.pageObject.com;

import org.dataReader.com.ReadDataFromPropFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage{

protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnOneWay() throws Exception{
		//WebElement oneWay = driver.findElement(By.id("onewayTrip"));
		Thread.sleep(4000);
		WebElement oneWay = driver.findElement(By.xpath(ReadDataFromPropFile.readDataFromPropFile("xpOneWay")));
		oneWay.click();
		System.out.println("Click on oneway");
	}
	
	public HomePage VerifyUserIsOnCorrectPage() {
		System.out.println("Checking .....");
		String actualTitle = driver.getTitle();
		System.out.println("Page title is = " + actualTitle);
		Assert.assertTrue(actualTitle.toLowerCase().contains("cheapoair"), "User is not on correct page");
		System.out.println("User is on correct page");
		
		return this;
		//return new HomePage(driver);
	}
	
	public void enterFromCity(String fromCity) throws Exception{
		driver.findElement(By.id(ReadDataFromPropFile.readDataFromPropFile("idFromCity"))).sendKeys(fromCity);
	}
	
	public void enterToCity(String toCity) throws Exception{
		driver.findElement(By.id(ReadDataFromPropFile.readDataFromPropFile("idToCity"))).sendKeys(toCity);
	}
	
	public void enterDepartDate(String days) {
		System.out.println("Days are = " + days);
		
		//Calculate current date
		//Month  - Date = Add + days
		
	}
	
	public void enterReturnDate() {
		
	}
	
	public ListingPage clickOnSearch() {
		
		
		return new ListingPage(driver);
	}

	
}
