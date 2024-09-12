package MouseActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement targetToRightClick=driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(driver);
		//contextClic():This method is used to perform the Right click action
		act.contextClick(targetToRightClick).perform();



	}

}
