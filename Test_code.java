import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSelenium {
    public static void main(String[] args) {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Search
        driver.findElement(By.name("q")).sendKeys("Selenium Java");

        // Press Enter
        driver.findElement(By.name("q")).submit();

        // Close browser
        driver.quit();
    }
}
