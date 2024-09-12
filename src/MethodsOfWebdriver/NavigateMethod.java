package MethodsOfWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");//navigate is used to launch web appln & used to perform navigation operation like forward,back and refresh
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);

		Navigation nav=driver.navigate();
		Thread.sleep(5000);
		nav.back();
		Thread.sleep(5000);
		nav.forward();
		Thread.sleep(5000);
		nav.refresh();




	}

}
