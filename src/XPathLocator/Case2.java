package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

	public static void main(String[] args) {
		// Case2= xpath using text()or text of webelement

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Syntax=//tagName[text()='textvalue']

				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
