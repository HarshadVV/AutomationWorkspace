package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		Thread.sleep(15000);

		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Admin123");
		//driver.findElement(By.cssSelector("li[id='Registration Desk']")).click();
		driver.findElement(By.cssSelector("input[class='btn confirm']")).click();





	}

}
