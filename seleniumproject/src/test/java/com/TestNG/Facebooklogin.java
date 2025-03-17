package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebooklogin {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver;
		
		//Launch chrome browser

		driver = new ChromeDriver();
		Thread.sleep(5000);
      driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Test3254624634@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sdgsfhdfgsdfhdh");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
  }
}
