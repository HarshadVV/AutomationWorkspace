package OperationalMethodsOfDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://formstone.it/components/dropdown/demo/");
		WebElement dropdownElement=driver.findElement(By.id("demo_multiple"));
		Select sel=new Select(dropdownElement);

		for (int i = 0; i<2; i++) {
			sel.selectByIndex(i);

		}
		//getFirstSelectedOption():It  is used to get the first selected option

		WebElement firstSelect=sel.getFirstSelectedOption();
		String firstSelectValue=firstSelect.getText();
		System.out.println(firstSelectValue);
	}

}
