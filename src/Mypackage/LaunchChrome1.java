package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid the IllegalStateException
		WebDriver driver=new ChromeDriver();//to open the browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.instagram.com");//launch the web app
		Thread.sleep(10000);//provide the delay of 10 seconds
		driver.close();//close the browser

	}

}
