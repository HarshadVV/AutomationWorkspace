package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.selenium.dev");
		WebElement var1=driver.findElement(By.xpath("//a[.='About']"));

		//getTagName():It is used to get the tag-name of web-elemet with which the web-element is designed
		String getTagname =var1.getTagName();
		System.out.println(getTagname);
	}

}
