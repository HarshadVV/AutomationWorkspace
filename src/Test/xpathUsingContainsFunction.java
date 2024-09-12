package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingContainsFunction {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();

     driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
     Thread.sleep(6000);
     driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Test1");
     driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Test2");

	}

}
