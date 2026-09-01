import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("YouTube");
        driver.findElement(By.name("btnK")).click();

        driver.findElement(By.partialLinkText("YouTube")).click();

        if (driver.getTitle().contains("YouTube")) {
            System.out.println("YouTube Verified");
        } else {
            System.out.println("Verification Failed");
        }

        driver.quit();
    }
}
