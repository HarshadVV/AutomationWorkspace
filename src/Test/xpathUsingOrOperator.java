package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingOrOperator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@class,' selenium-webdriver') and contains(@class,'selenium-ide') and contains(@class,'selenium-grid ')]")).click();


	}

}
