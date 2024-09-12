package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2Syntax2 {

	public static void main(String[] args) {
		// Case2= xpath using text()or text of webelement

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Syntax=//tagName[.='textvalue']

		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.xpath("//button[.='Continue']")).click();


	}

}
