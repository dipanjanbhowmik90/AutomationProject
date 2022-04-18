package com.cognizant.test;

import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerateReportPathTest {

	
	
	
	@Test(groups = { "report1", "report2", "report3", "report4" })
	public void generateReport() throws InterruptedException {
		String currentUrl = openLatestAllure();
		String fileName = System.getProperty("groups");
		writeAFile(currentUrl, fileName);
	}

	public String openLatestAllure() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://precisionreporters.github.io/prp-uitests-selenium/");
		return driver.getCurrentUrl();
	}

	public void writeAFile(String currentUrl, String fileName) {
		try {
			FileWriter fw = new FileWriter(fileName+".txt");
			fw.write(currentUrl);
			fw.close();
		} catch (Exception e) {
		}
	}
}
