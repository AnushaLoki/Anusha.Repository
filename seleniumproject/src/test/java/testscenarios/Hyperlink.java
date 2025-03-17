package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Click on Forgot password? hyperlink
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("For")).click();

	}

}
