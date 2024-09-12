package HandlingTheDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://qavalidation.com/demo-form/");
		WebElement  dropdownElement=driver.findElement(By.id("g4072-gender")); //locate the dropdown
		Select selectValue=new Select(dropdownElement);
		selectValue.selectByIndex(1);

		System.out.println(selectValue);

	}

}
