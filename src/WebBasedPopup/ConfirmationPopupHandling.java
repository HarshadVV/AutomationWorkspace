package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopupHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

		/*Characteristic of Javascript Alert Popup:
		 * It is not colorfil
		 * It is not inspectable
		 * It is present at middle of URl bar
		 * It is having two buttons i.e OK and Cancel
		 */
		Alert ale=driver.switchTo().alert();
		//ale.accept();
		ale.dismiss();

	}

}
