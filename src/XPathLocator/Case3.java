package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {

	public static void main(String[] args) throws InterruptedException {
		// Case3= xpath using contains()

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Syntax=//tagName[contains(@attribute name='attribute value']
		Thread.sleep(4000);


		driver.get("https://www.instagram.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(@class, '_aacl _aaco _aacw _aad0 _aad7')]")).click();



	}

}
