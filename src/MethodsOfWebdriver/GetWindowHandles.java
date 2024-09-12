package MethodsOfWebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		 Set<String> handles=driver.getWindowHandles();//It is used to get ID's of multiple browser window
		 System.out.println("Handles in array format= "+handles);// here by using sout we get output in form of array by using for each we get output line by line

		 for(String handle:handles) {

			 System.out.println(handle);
		  }

	}

}
