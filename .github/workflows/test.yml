package com.cognizant.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

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
			File[] files = new File(".").listFiles();

			for (File file : files) {
			    if (file.isFile()) {
			    	System.out.println("************************");
			        String filePath = file.getCanonicalPath();
			        System.out.println(filePath);
			        System.out.println(filePath.substring(filePath.lastIndexOf(".")+1));
			    }
			}
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

	@Test(groups = { "file" })
	public void fileExtension() throws IOException {
		File[] files = new File(".").listFiles();

		for (File file : files) {
		    if (file.isFile()) {
		    	System.out.println("************************");
		        String filePath = file.getCanonicalPath();
		        System.out.println(filePath);
		        System.out.println(filePath.substring(filePath.lastIndexOf(".")+1));
		    }
		}
		
	}
}
