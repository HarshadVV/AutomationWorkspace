package WebElementMethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/");
		 WebElement targetElement=driver.findElement(By.xpath("//h2[.='News']"));

		 //getLocation():It is used to get the location of web-element


		   Point elementLocation=targetElement.getLocation();
		   int xaxis=elementLocation.getX();
		   int yaxis=elementLocation.getY();

		   System.out.println(xaxis +" is the xaxis distance");
		   System.out.println(yaxis +" is the yaxis distance");

		}

}
