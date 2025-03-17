package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_1_Assignments {
	@Test
	public void Test1() {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/Thanu/AppData/Local/Microsoft/Windows/INetCache/IE/3XD05BHV/QE%20-%20index[1].html");
		driver.manage().window().maximize();

		if (driver.findElements(By.id("inputEmail")).size() > 0) {

			System.out.println("username box is dispalyed");
		}

		else {

			System.out.println("username box is not dispalyed");
		}

		if (driver.findElements(By.id("inputPassword")).size() > 0) {

			System.out.println("input box is dispalyed");
		}

		else {

			System.out.println("input box is not dispalyed");
		}

		if (driver.findElements(By.xpath("//*[@id=\"test-1-div\"]/form/button")).size() > 0) {

			System.out.println("login button is dispalyed");

		} else {
			System.out.println("loginbutton is not displayed");

		}

	}
}
