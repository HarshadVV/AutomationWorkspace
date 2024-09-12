package TakeScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfParticularWebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/downloads/");

		//screenshot of webelement
		WebElement target=driver.findElement(By.xpath("//span[.='Downloads']"));
		File src=target.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/seldownload.png");
		Files.copy(src, dest);

		}

}
