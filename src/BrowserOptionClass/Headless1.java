package BrowserOptionClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Headless testing:Everthing thing gets exceuted at backend instead of UI
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless=new");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		 String siteTitle=driver.getTitle();
		 System.out.println(siteTitle);




	}

}
