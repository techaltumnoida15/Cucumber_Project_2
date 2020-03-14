package org.pageObject.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage{

protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
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
	
	public void enterFromCity(String fromCity) {
		driver.findElement(By.xpath("")).sendKeys(fromCity);
	}
	
	public void enterToCity(String toCity) {
		driver.findElement(By.xpath("")).sendKeys(toCity);
	}
	
	public void enterDepartDate() {
		
	}
	
	public void enterReturnDate() {
		
	}
	
	public ListingPage clickOnSearch() {
		
		
		return new ListingPage(driver);
	}

	public void clickOnOneWay() {
		WebElement oneWay = driver.findElement(By.id("onewayTrip"));
		oneWay.click();
		System.out.println("Click on oneway");
	}
}
