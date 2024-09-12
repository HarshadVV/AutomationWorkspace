package OperationalMethodsOfDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://formstone.it/components/dropdown/demo/");
		WebElement dropdownElement=driver.findElement(By.id("demo_multiple"));
		Select sel=new Select(dropdownElement);
		WebElement wrappedElement=sel.getWrappedElement();
		String getWrappedElement=wrappedElement.getText();
		System.out.println(getWrappedElement);

	}

}
