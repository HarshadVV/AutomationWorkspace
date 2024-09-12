package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

	public static void main(String[] args) {
		// Case1= xpath using unique attribute(id,name,title,placeholder)

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Syntax=//tagName[@attributename='attribute value']

		driver.get("https://admin.autox.katdev.com/admin/login");

		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("pipl.arvind@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@2022");
		driver.findElement(By.xpath("//input[@value='Login']")).click();





	}

}
