 	package HandlingTheDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdownSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("file:///C:/Users/hvayandeshkar/OneDrive%20-%20Katalyst%20Technologies%20Inc/Desktop/HTML%20Files/Mutiple%20select%20dropdown.html");
		WebElement dropdownElement=driver.findElement(By.id("select"));
		Select sel=new Select(dropdownElement);

		for (int i = 0; i <=2; i++) {
			sel.selectByIndex(i);
			Thread.sleep(5000);
			}
	}

}
