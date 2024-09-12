package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testMethods {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hvayandeshkar/OneDrive%20-%20Katalyst%20Technologies%20Inc/Desktop/HTML%20Files/Mutiple%20select%20dropdown.html");
		Thread.sleep(15000);


		WebElement  dropdownElemnt=driver.findElement(By.id("select"));
		Select sel=new Select(dropdownElemnt);
		 for (int i = 2; i <=3; i++) {
             sel.selectByIndex(i);
             Thread.sleep(6000);
             }

		}

}
