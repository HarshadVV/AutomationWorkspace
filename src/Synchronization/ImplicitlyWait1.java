package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ImplicitlyWait1 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");

		driver.findElement(By.name("username")).sendKeys("harshad");
		driver.findElement(By.name("password")).sendKeys("pass@123");
		driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']")).click();





	}

}
