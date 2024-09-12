package WebElementMethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/");
		 WebElement targetElement=driver.findElement(By.xpath("//h2[.='News']"));

		 //getRect():It is used to get the height and width of web-element

		 //for height and width
		  Rectangle rect=targetElement.getRect();
		   int height=rect.getHeight();
		   int width=rect.getWidth();
		   System.out.println(height +" is height of element");
		   System.out.println(width +" is width of element");

		}

}
