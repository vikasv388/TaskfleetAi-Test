import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    public static void main(String[] args) 

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Maximize browser
        driver.manage().window().maximize();

        // Locate Google search box
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter search text
        searchBox.sendKeys("Selenium WebDriver");

        // Submit search
        searchBox.submit();

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    
