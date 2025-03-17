package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerthandling {
  @Test
  public void f() throws Exception {
	  
	 WebDriver driver;
	 
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/alerts");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.findElement(By.id("alertButton")).click();
	 driver.switchTo().alert().accept();
	 driver.findElement(By.id("timerAlertButton")).click();
	 Thread.sleep(6000);
	 driver.switchTo().alert().accept();
	 driver.findElement(By.id("confirmButton")).click();
	 driver.switchTo().alert().accept();
	 //driver.findElement(By.id("promtButton")).click();
	 //driver.switchTo().alert().accept();
	 
	 
  }
}
