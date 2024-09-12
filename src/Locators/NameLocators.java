package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "./drivers.geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://admin.trexodev.katdev.com/admin/login");
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin123");
		driver.findElement(By.name("login")).click();


	}

}
