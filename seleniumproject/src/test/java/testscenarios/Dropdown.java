package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//dropdown code
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByVisibleText("1947");
		
//		Select month =new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
//		month.selectByVisibleText("August");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"))).selectByVisibleText("August");
		new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("15");
		

	}

}
