package sequencepipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://www.google.com");

          
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Test Sample");
            ScreenshotListener.captureScreenshot(driver);

           
            searchBox.submit();

            
            Thread.sleep(2000);

            
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}
