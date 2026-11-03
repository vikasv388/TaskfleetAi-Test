import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open webpage
        driver.get("https://www.google.com");

        // Maximize browser
        driver.manage().window().maximize();

        // Handle textbox
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium Java");

        // Press Enter
        search.sendKeys(Keys.ENTER);

        // Close browser
        driver.quit();
    }
}
