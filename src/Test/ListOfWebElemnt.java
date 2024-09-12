package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListOfWebElemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();

		WebElement targetRing=driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));

		Actions act=new Actions(driver);
		act.moveToElement(targetRing).perform();
		driver.findElement(By.xpath("//a[@title='Diamond Rings' and .='Diamond']")).click();
		List<WebElement> prodList=driver.findElements(By.xpath("//h2[@class='p-name']"));

		int numberOfProduct=prodList.size();
		System.out.println("Number Of Product in List=  "+numberOfProduct);

	}

}
