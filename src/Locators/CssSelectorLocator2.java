package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("pass@123");
		driver.findElement(By.cssSelector("[class='_acan _acap _acas _aj1-']")).click();



	}
}
