package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("file:///C:/Users/hvayandeshkar/OneDrive%20-%20Katalyst%20Technologies%20Inc/Desktop/HTML%20Files/Disabled%20textbox.html");


		/* When we use ChromeDriver driver=new ChromeDriver then we can directly assign driver value to JavasriptExecutor as below
		 JavascriptExecutor jse=driver;

		 *When we WebDriver driver=new ChromeDriver then we have to use typecasting like
		 JavascriptExecutor jse=(JavascriptExecutor)driver;

		 */

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement usn=driver.findElement(By.id("i1"));

		if (usn.isEnabled()) {
			System.out.println("If block is executed for username");
			usn.sendKeys("admin");


		}
		else {
			System.out.println("Else block executed for username");
			jse.executeScript("document.getElementById('i1').value='admin'");

		}
		WebElement pass=driver.findElement(By.id("i2"));
		if (pass.isEnabled()) {
			System.out.println("If block executed for password ");
			pass.sendKeys("pass@123");


		} else {
			System.out.println("Else block executed for password");
			jse.executeScript("document.getElementById('i2').value=pass@123");
		}
	}

}
