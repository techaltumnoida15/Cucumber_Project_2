package org.pageObject.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import baseClass.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HomePage{

protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void VerifyUserIsOnCorrectPage() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertTrue(actualTitle.toLowerCase().contains("cheapoair"), "User is not on correct page");
		System.out.println("User is on correct page");
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
	
	public void clickOnSearch() {
		
	}
}
