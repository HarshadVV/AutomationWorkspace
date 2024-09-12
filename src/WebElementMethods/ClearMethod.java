package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));

		username.sendKeys("harshad");
		pass.sendKeys("pass@123");

		Thread.sleep(10000);
		//clear()=It is used to clear the values/text from the text field
		username.clear();
		pass.clear();
		}
	}
