
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubePage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open YouTube
        driver.get("https://www.youtube.com");

        // Search video
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("Java Selenium Tutorial");
        search.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        // Click first video
        driver.findElement(By.cssSelector(
            "ytd-video-renderer a#video-title"
        )).click();

        Thread.sleep(5000);

        // Print title and URL
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        // Close browser
        driver.quit
    

