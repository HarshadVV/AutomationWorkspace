package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//sendKeys():It is used to send keys/text/values to the text fields
		Thread.sleep(5000);
		WebElement sendUsername=driver.findElement(By.name("username"));
		sendUsername.sendKeys("Admin");
		Thread.sleep(5000);
		WebElement sendPassword=driver.findElement(By.name("password"));
		sendPassword.sendKeys("admin123");

	}

}
