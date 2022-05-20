package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
    public static void main(String[] args) throws InterruptedException {

// Set Pat
        WebDriverManager.chromedriver().setup();
// Create chrome driver
        WebDriver driver=new ChromeDriver();
// Maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
       WebElement arama=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
       arama.sendKeys("lego", Keys.ENTER);
        Thread.sleep(3000);
// On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
        driver.get("https://www.amazon.com");
        WebElement amazonArama=driver.findElement(By.id("twotabsearchtextbox"));
        amazonArama.sendKeys("lego", Keys.ENTER);
        Thread.sleep(3000);
        driver.navigate().back();
// Navigate forward to amazon
        driver.navigate().forward();
// Refresh the page
        driver.navigate().refresh();
// Close/Quit the browser
        driver.close();
        driver.quit();
// And last step : print "all ok" on console


    }

}
