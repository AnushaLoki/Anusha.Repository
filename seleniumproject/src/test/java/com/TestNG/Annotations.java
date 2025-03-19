package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Annotations {

	WebDriver driver;

	@Test

	public void f() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
				.sendKeys("Admin");
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
				.sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
        Thread.sleep(2000); // Wait for the dropdown to appear

        // Click on Logout option
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new ChromeDriver();
		Thread.sleep(5000);

	}

	@AfterClass
	public void afterClass() {
	driver.quit();
	}

	}
