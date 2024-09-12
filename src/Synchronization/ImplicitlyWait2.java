package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		/* implicitlyWait(long, TimeUnit) is deprecated(out-dated) its now replace by implicitlyWait(Duration duration)
		e.g. implicitlyWait(40, TimeUnit.SECONDS)= implicitlyWait(Duration.ofSeconds(50))*/

		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//a[.='Cart']")).click();
		driver.findElement(By.xpath("//span[.='Login10']")).click(); // we will be getting the NoSuchElementException because such kind of web-element is not present on web-page


	}

}
