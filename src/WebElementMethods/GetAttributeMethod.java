package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));

		//getAttribute():It is used to get the values of specified attribute
	    String unameAttribute=uname.getAttribute("placeholder");
	    String passAttribute=pass.getAttribute("placeholder");

	    System.out.println(unameAttribute);
	    System.out.println(passAttribute);
	}

}
