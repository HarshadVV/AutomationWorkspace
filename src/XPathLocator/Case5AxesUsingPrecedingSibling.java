package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case5AxesUsingPrecedingSibling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[.='✕']")).click(); //get login pop up cancel
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[.='Mi']")).click(); //select MI
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Battery Capacity']")).click(); //click on battery dropdown
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[.='6000 mAh & Above']/preceding-sibling::div[@class='_24_Dny']")).click(); //select 6000 maH checkbox

	}

}
