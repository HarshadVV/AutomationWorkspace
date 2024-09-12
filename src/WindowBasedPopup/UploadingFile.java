package WindowBasedPopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadingFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://omayo.blogspot.com/");



         WebElement uploadfile=driver.findElement(By.id("uploadfile"));

         Actions act=new Actions(driver);
        act.doubleClick(uploadfile).perform();

        Thread.sleep(10000);
        Runtime.getRuntime().exec("./autoitscripts/Uploadfile.exe"+"  "+"D:\\test.jpg");




		}

}
