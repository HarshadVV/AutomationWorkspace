package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));

		//getCssValue():It is used to get the vale of specified Css property
		String unameCssValue=uname.getCssValue("font");
		String passCssValue=pass.getCssValue("color");
		System.out.println(unameCssValue);
		System.out.println(passCssValue);
	}

}

