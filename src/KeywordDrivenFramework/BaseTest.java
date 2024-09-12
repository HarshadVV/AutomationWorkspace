package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	
	//method to open browser
	public void openBrowser() throws IOException
	{
		Flib flib=new Flib();
		
		//read the data from property file (browser)
		String browserValue=flib.readPropetyFile(PROP_PATH,"browser");
		//read the data from property file (url)
		String url=flib.readPropetyFile(PROP_PATH, "url");
		//use value of browser
		if(browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
			}
		else if (browserValue.equalsIgnoreCase("firefox")) 
			{
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			}
		else
			{
				System.out.println("Enter correct choice");
			}	
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}
