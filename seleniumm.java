import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimplePageHandler {
    public static void main(String[] args) {
        // 1. Open Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Go to the webpage
        driver.get("https://www.google.com");

        // 3. Type text into an input box
        driver.findElement(By.name("q")).sendKeys("Selenium Java");

        // 4. Click a button (or press Enter)
        driver.findElement(By.name("q")).submit();

        // 5. Print the title
        System.out.println("Title: " + driver.getTitle());

        // 6. Close the browser
        driver.quit();
    }
}
