package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopupHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notification");
		co.addArguments("-start-maximized");

		WebDriver driver=new ChromeDriver(co);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://forfrontend.com/css-notification-popup/");



	}

}
