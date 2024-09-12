 package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		Flib flib=new Flib();
		int rc=flib.getRowCount("./data/Orangehrmcred.xlsx","invalidcred");
		
		for(int i=1;i<=rc;i++) {
			String username=flib.readExcelData("./data/Orangehrmcred.xlsx","invalidcred", i, 0);
			String pass=flib.readExcelData("./data/Orangehrmcred.xlsx", "invalidcred",i, 1);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).clear();
		}
	}

}
