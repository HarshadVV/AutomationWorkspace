package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin.trexodev.katdev.com/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("pipl.arvind@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Pass@2022");
		driver.findElement(By.cssSelector("input[class='btn btn-block btn-primary mb-4']")).click();

	}

	}


