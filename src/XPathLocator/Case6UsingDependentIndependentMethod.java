package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case6UsingDependentIndependentMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);

		//driver.findElement(By.xpath("//span[.='✕']")).click(); //get login pop up cancel
		//Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 15");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(5000);

	    String prodPrice=driver.findElement(By.xpath("//div[.='Apple iPhone 15 (Blue, 128 GB)']/ancestor::div[@data-id='MOBGTAGPAQNVFZZY']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(prodPrice);

	}

}
