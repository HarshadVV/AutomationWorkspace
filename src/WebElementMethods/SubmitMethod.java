package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.instagram.com/");
		WebElement userName=driver.findElement(By.name("username"));
		WebElement pass=driver.findElement(By.name("password"));

		 userName.sendKeys("TEST");
		 pass.sendKeys("Pass@123");

		 WebElement btnLogin=driver.findElement(By.cssSelector("button[class*=' _acan _acap']"));

		 /*submit():It is only for the web-element which are button or having type as 'submit'.
		  * And also it can be only use for the web-element which are design under or using tag <form>
		  */

		 btnLogin.submit();

	}

}
