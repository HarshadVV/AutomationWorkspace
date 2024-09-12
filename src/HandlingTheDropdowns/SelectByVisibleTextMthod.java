package HandlingTheDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextMthod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavalidation.com/demo-form/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement dropdownElement=driver.findElement(By.id("g4072-gender"));
		Select selectValue=new Select(dropdownElement);
		selectValue.selectByVisibleText("NA");

	}

}
