package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingContainsFunction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();

	     driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();

	}

}
