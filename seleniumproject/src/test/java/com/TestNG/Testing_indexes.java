package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.CaseFormat;

public class Testing_indexes {
	WebDriver driver;

	public void checkElement(By element, String text1, String text2) {

		if (!driver.findElements(element).isEmpty()) {
			System.out.println(text1);
		} else {

			System.out.println(text2);
		}
 
	}

	public void reuseCode(By element, String text) {
		System.out.println(element);
		if (text == "inputEmail") {
			checkElement(element, "Username editbox is displayed", "Username editbox is not displayed");
		} else if (text == "inputPassword") {
			checkElement(element, "Password editbox is displayed", "Password editbox is not displayed");
		} else if (text == "signIn") {
			checkElement(element, "Sign in button is displayed", "Sign in button is not displayed");
		}
//		if (!driver.findElements(element).isEmpty()) {
//			System.out.println("Web Element is displayed");			
//		} else {
//
//			System.out.println("Web Element is not displayed");
//		}
	}

	@Test
	public void f() {

		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/Thanu/AppData/Local/Microsoft/Windows/INetCache/IE/KQCVF3GA/QE%20-%20index[1].html");
		driver.manage().window().maximize();
		reuseCode(By.id("inputEmail"), "inputEmail");
		reuseCode(By.id("inputPassword"), "inputPassword");
		reuseCode(By.xpath("//*[@id=\"test-1-div\"]/form/button"), "signIn");

//		if (!driver.findElements(By.id("inputEmail")).isEmpty()) {
//
//			System.out.println("Username editbox is displayed");			
//		} else {
//
//			System.out.println("Username editbox is not displayed");
//		}
//
//		if (!driver.findElements(By.id("inputPassword")).isEmpty()) {
//
//			System.out.println("Password editbox is displayed");
//		} else {
//
//			System.out.println("Password editbox is not displayed");
//		}
//
//		if (!driver.findElements(By.xpath("//*[@id=\"test-1-div\"]/form/button")).isEmpty()) {
//
//			System.out.println("Sign in button is displayed");
//		} else {
//
//			System.out.println("Sign in button is not displayed");
//		}

		driver.findElement(By.id("inputEmail")).sendKeys("");
		driver.findElement(By.id("inputPassword")).sendKeys("");

	}
}
