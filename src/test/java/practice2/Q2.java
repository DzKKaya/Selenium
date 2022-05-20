package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Q2 {

    static WebDriver driver;
    //http://www.bestbuy.com 'a gidin,
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.bestbuy.com");
    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    // Sayfa basliginin "Best" icerdigini(contains) dogrulayin
    @Test
    public void sayfaBasligi(){
        Assert.assertTrue(driver.getTitle().contains("Best"));
    }
    // Ayrica Relative Locator kullanarak;
    //    logoTest => BestBuy logosunun gorunutulenip goruntulenmedigini dogrulayin
    @Test
    public void logoTest(){
        WebElement logo=driver.findElement(By.xpath("//img[@class='logo']"));
        Assert.assertTrue(logo.isDisplayed());
    }
    //mexicoLinkTest => Linkin gorunutulenip goruntulenmedigini dogrulayin
    @Test
    public void mexicoLinkTest(){
        WebElement mexico=driver.findElement(By.xpath("//img[@alt='Mexico']"));
        Assert.assertTrue(mexico.isDisplayed());

    }
}

