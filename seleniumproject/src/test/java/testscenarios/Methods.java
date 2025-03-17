package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		// Click on login button without fill any test data
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);

		// getText()
		// Get the Error message Text using getText()
		String errmsg = driver.findElement(By.className("woocommerce-error")).getText();
		System.out.println(errmsg);

		System.out.println("***************************************************");

		// isSelected()
		driver.get("https://demo.automationtesting.in/Register.html");
		// Validate Male radio button is selected or not?
		if (driver.findElement(By.name("radiooptions")).isSelected()) {
			System.out.println("Element is Selected");
		} else {
			System.out.println("Element is NOT Selected");
		}
		System.out.println("***************************************************");

		driver.get("https://app.phptravels.com/login");
		// Validate Male radio button is selected or not?
		if (driver.findElement(By.id("flexCheckChecked")).isSelected()) {
			System.out.println("Element is Selected**");
		} else {
			System.out.println("Element is NOT Selected**");
		}
		
		// isEnabled()
		driver.get("https://app.phptravels.com/signup");
		// Validate signup button is enabled or not?
		if (driver.findElement(By.id("submit")).isEnabled()) {
			System.out.println("Element is Enabled state**");
		} else {
			System.out.println("Element is Disabled state**");
		}
		
		//isDisAPLYED
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Test3254624634@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sdgsfhdfgsdfhdh");
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		
		// Validate whether given locator is displayed on the current page?
		if (driver.findElement(By.linkText("Find your account and log in.")).isDisplayed()) {
			System.out.println("given credentials are invalid, please type valid test data**");
		} else {
			System.out.println("given credentials are valid, logged in successfully**");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
