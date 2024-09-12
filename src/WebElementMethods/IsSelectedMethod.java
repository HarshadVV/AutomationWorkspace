package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
        driver.get("https://portal.zinghr.com/2015/pages/authentication/login.aspx");

        WebElement checkButton= driver.findElement(By.id("chkRemember"));
        // Locate the label associated with the radio button
       // WebElement label = driver.findElement(By.xpath("//label[@class='formCheckbox multilingual_h']"));
         //isSelectedMethod(): It is used to check whether the web element is selected or not
        boolean beforeSelect = checkButton.isSelected();
        System.out.println("Status before selection: " + beforeSelect);

        checkButton.click();
        //label.click();

        boolean afterSelect = checkButton.isSelected();
        System.out.println("Status after selection: " + afterSelect);

        driver.quit();
    }
}
