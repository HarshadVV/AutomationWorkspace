package HandlingDifferentScenarios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLink {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement>  links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+links.size());
		int noOfBrokenLinks=0;

		for (WebElement linkElement : links) {
			String hrefValue=linkElement.getAttribute("href");

			if (hrefValue==null || hrefValue.isEmpty()) {
				System.out.println("href attribute value is empty.So possible to check");
				continue;
			}
			//hit URL to the server

			try {
				URL linkURL=new URL(hrefValue);//convert hrefvalue from string to URL
				 HttpURLConnection connLinkURL=(HttpURLConnection) linkURL.openConnection(); //open connection to server
				connLinkURL.connect();//connect to the server and send request to server

				if (connLinkURL.getResponseCode()>=400) {
					System.out.println( hrefValue+"  :Link is broken");
					noOfBrokenLinks++;
				}
				else {
					System.out.println( hrefValue+"  :Not a broken link");
				}
			}
			catch (Exception e) {

}
			System.out.println("No of Broken Links: "+noOfBrokenLinks);



		}


	}

}
