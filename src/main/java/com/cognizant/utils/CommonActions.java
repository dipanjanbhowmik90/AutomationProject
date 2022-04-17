package com.cognizant.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {

	private WebDriver driver;
	
	public void createWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void openWebSite(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public void closeCurrentTab() {
		driver.close();
	}

	public void closeAllTabs() {
		driver.quit();
	}
	
	public void elementClick(WebElement element) {
		element.click();
	}
	
	public void inputText(WebElement element,String text) {
		element.sendKeys(text);
	}
}
