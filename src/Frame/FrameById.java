package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameById {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("fc_widget"); //switch control chat frame
		driver.findElement(By.id("chat-icon")).click();


	}

}
