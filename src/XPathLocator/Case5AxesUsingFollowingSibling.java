package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case5AxesUsingFollowingSibling {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);

		//driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='XqNaEv']/following-sibling::div[.='4★ & above']")).click(); //select  4 rating and above
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='XqNaEv']/following-sibling::div[.='2 GB']")).click(); //select 2gb mobile filter
	}

}
