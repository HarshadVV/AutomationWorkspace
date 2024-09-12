package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://testautomationpractice.blogspot.com/");
		//1.select the single check-box
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		//2.select all check-boxes
	/*	using basic for loop
		for (int i=0; i<checkboxes.size();i++) {
			checkboxes.get(i).click();

		}
	*/

	/*	using for-each loop
		for(WebElement checkbox:checkboxes) {
			checkbox.click();
		}
	*/

		//3.Select last 3 check-boxes
		//condition=total checkbox-how many check-boxes to select=stating index
	/*	for(int i=4; i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
	*/

	//4.Select first 3 check-boxes
	/*	for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
	*/

	//5.Unselect the check-boxes if select
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}

		Thread.sleep(5000);
		for (WebElement element : checkboxes) {
			if(element.isSelected()) {
				element.click();
		}
		}
}
}