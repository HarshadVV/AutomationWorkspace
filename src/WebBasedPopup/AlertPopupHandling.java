package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		Thread.sleep(5000);

		/*Characteristic of Javascript Alert Popup:
		 * It is not colorful
		 * It is not inspectable
		 * It is present in middle of URl bar
		 * It is having only one button i.e OK
		 */
		 Alert ale=driver.switchTo().alert();
		 ale.accept();
		// ale.dismiss(); //for dismiss


	}

}
