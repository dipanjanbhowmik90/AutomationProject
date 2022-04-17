package com.cognizant.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class TEST {

	/*
	 * public static void main(String[] args) { CommonActions commonActions = new
	 * CommonActions(); commonActions.createWebDriver();
	 * commonActions.openWebSite("https://demoqa.com/"); WebDriver driver =
	 * commonActions.getWebDriver(); HomePage homePage = new
	 * HomePage(driver,commonActions); //homePage.clickForm(); }
	 */

	@Test(groups = { "write" })
	public void writeFileTest() {
		try {
			FileWriter fw = new FileWriter("dipanjan.txt");
			fw.write("Test Data");
			fw.close();
		} catch (Exception e) {
		}
	}

	@Test(groups = { "read" })
	public void readFileTest() throws IOException {
		File file = new File("dipanjan.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		System.out.println("*******************");
		while ((st = br.readLine()) != null)
			System.out.println(st);
		System.out.println("*******************");
	}
}
