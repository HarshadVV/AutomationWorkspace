package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.actitime.com/login-to-product");
		WebElement var=driver.findElement(By.xpath("//button[.='Send a code']"));

		//isEnabled():It is used to check whether the web-element is enabled or not
		boolean sendCodeButton=var.isEnabled();

		System.out.println(sendCodeButton + " Button status");

		//Using if-else condition
		if(var.isEnabled()) {
			 System.out.println("Button is enabled" );
		 }
		 else {
		 System.out.println("Button is not enabled ");
		 }


	}

}
