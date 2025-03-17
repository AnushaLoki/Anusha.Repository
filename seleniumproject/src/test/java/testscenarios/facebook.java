package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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


