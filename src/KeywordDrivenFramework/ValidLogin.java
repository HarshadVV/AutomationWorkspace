package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		Flib flib=new Flib();
		
		
		//read the data from property file use the generic reusable method
		String username=flib.readPropetyFile(PROP_PATH,"username");
		String password=flib.readPropetyFile(PROP_PATH, "password");
		Thread.sleep(5000);
		//open the browser
		bt.openBrowser();
		Thread.sleep(5000);
		//perform login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		
		//close the browser
		bt.closeBrowser();
		
		

	}

}
