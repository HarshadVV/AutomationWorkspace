package MethodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUsingForEach {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("bikes");

		List<WebElement> sugg=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

		for (WebElement websuggest : sugg) {
			String textOfWebSuggest=websuggest.getText();
			System.out.println(textOfWebSuggest);
		}


	}

}
