package com.cognizant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cognizant.utils.CommonActions;

public class HomePage {

	WebDriver driver;
	CommonActions commonActions;
	
	public HomePage(WebDriver driver, CommonActions commonActions) {
		this.driver=driver;
		this.commonActions=commonActions;
	}
	
	public void enterLocation() {
		WebElement locationDropDown = driver.findElement(By.xpath("(//span[contains(text(),'Enter airport')])[1]"));
		commonActions.elementClick(locationDropDown); //locationDropDown.click();
		
	}

	
}
