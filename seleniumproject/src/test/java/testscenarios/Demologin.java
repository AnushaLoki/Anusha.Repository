package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demologin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// type some data into password editbox
		driver.findElement(By.id("firstpassword")).sendKeys("seleniumsdgq34ref@gmail.com");

		// Click on Male Radio button
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();

	}

}
