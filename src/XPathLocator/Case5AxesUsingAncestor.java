package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case5AxesUsingAncestor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(10000);

		//driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[.='POCO']/ancestor::div[@class='_4921Z t0pPfW']")).click();





	}

}
