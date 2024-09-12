package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click the 'Start' button
        driver.findElement(By.xpath("//button[.='Start']")).click();

        // Define WebDriverWait and wait until the element with the text 'Hello World!' is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement var1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[.='Hello World!']")));

        // Get the text of the element and print it
        String textOfElement = var1.getText(); // Ensure to trim any leading or trailing whitespace
        System.out.println(textOfElement);

     /* Conditions of Expected condition class:
      * i.visibilityOfElementLocated(By locator):This condition when you want to wait for an element to be present in the DOM and visible on the web page
      * ii.elementToBeClickable(By locator):This condition when you want to wait for an element to be clickable, meaning it is visible and enabled such that you can click on it
      * iii.presenceOfElementLocated(By locator):This condition when you want to wait for an element to be present in the DOM of a page. It does not check if the element is visible or clickable
      * iv.titleContains(String title)
      */

     }

}
