package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


		driver.get("https://www.flipkart.com/");

		WebElement ele=driver.findElement(By.xpath("//div[@class='_38VF5e']/descendant::a[@class='_3RX0a-']"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/cart.png");
		Files.copy(src, dest);
	}

}
