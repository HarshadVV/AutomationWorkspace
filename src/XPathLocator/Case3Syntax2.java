package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3Syntax2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.get("https://www.facebook.com/login/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

	}

}
