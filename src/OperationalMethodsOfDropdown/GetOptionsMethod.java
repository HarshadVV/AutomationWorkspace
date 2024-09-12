package OperationalMethodsOfDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://formstone.it/components/dropdown/demo/");
		WebElement dropdownElemnt=driver.findElement(By.id("demo_multiple"));
		Select sel=new Select(dropdownElemnt);
		List<WebElement>  option=sel.getOptions();

		/*for (int i=0; i<option.size(); i++) {
			WebElement getOption=option.get(i);
			String optionValue=getOption.getText();
			System.out.println(optionValue);
			}
			*/
		for(WebElement getOption:option) {
			String optionValue=getOption.getText();
			System.out.println(optionValue);
		}

	}



}
