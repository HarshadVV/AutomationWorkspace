package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev");

		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0, 600)");

		 Thread.sleep(5000);
		 jse.executeScript("window.scrollBy(0,-300)");
	}

}
