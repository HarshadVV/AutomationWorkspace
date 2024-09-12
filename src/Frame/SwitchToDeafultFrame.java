package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDeafultFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("file:///C:/Users/hvayandeshkar/OneDrive%20-%20Katalyst%20Technologies%20Inc/Desktop/HTML%20Files/Login%20Page%20iFrame.html");
		WebElement username=driver.findElement(By.id("i1"));
		username.sendKeys("admin@gmail.com");
		Thread.sleep(6000);

		driver.switchTo().frame(0);
		WebElement password=driver.findElement(By.id("i2"));
		password.sendKeys("Pass@123");
		Thread.sleep(6000);
		//defaultContent(): It is used to switch the control back to default page from frame
		driver.switchTo().defaultContent();
		username.clear();

	}

}
