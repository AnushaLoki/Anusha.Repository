package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sbilogin {
  @Test
  public void f() throws Exception {
	  
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
	driver.manage().window().maximize();
	driver.findElement(By.className("login_button")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("Button2")).click();
	driver.switchTo().alert().accept();
;	
	  
	  
	  
	  
	  
	  
  }
}
