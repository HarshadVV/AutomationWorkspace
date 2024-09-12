package OperationalMethodsOfDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://formstone.it/components/dropdown/demo/");
		WebElement dropdownElement=driver.findElement(By.id("demo_multiple"));
		Select sel=new Select(dropdownElement);
		/*isMultiple():This method is used to check the type of drop-down
		 * If it is an multi-select drop-down it return 'true' otherwise 'false'
		 */

		boolean statusOfDropdown=sel.isMultiple();
		System.out.println(statusOfDropdown);

		if(statusOfDropdown=true) {
			System.out.println("Dropdown is Multiselect");
		}
		else {
			System.out.println("Dropdown is not a Multiselect");
		}
	}

}
