package OperationalMethodsOfDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://formstone.it/components/dropdown/demo/");
		WebElement dropdownElement=driver.findElement(By.id("demo_multiple"));
		Select sel=new Select(dropdownElement);

		for (int i = 3; i <=9; i++) {
			sel.selectByIndex(i);

			}

		//getAllSelectedOptions():It  use  to get all selected option
		List<WebElement> allSelect=sel.getAllSelectedOptions();
		for(WebElement allSelectedValue:allSelect) {
			String getAllValue=allSelectedValue.getText();
			System.out.println(getAllValue);
		}
	}

}
