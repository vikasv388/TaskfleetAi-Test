import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSelenium {

    public static void main(String[] args) {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://the-internet.herokuapp.com/login");

        // Enter username
        driver.findElement(By.id("username"))
              .sendKeys("tomsmith");

        // Enter password
        driver.findElement(By.id("password"))
              .sendKeys("SuperSecretPassword!");

        // Click login button
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        // Print page title
        System.out.println(driver.getTitle());

        // Close browser
        driver.quit();
    }
}
