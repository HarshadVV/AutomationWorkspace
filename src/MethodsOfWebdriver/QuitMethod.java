package MethodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(4000);
		driver.quit();//used to closed both parent and child window



	}

}
