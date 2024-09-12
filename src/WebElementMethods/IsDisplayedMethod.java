package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev");
		WebElement var1=driver.findElement(By.xpath("//a[.='About']"));

		//isDisplayed(): It is used to check whether the webelemet is displayed or not
		boolean statusOfWebElement=var1.isDisplayed();
		System.out.println(statusOfWebElement);

	}

}
