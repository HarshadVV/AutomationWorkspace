package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		Thread.sleep(5000);
		driver.findElement(By.id("myTextarea")).sendKeys("ID Locator");



	}

}
