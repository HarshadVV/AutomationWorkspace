package MethodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(4000);

			List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

	for (WebElement websuggestion : suggestions) {
		String textOfWebSuggestion=websuggestion.getText();
		System.out.println(textOfWebSuggestion);

	}

	}

}
