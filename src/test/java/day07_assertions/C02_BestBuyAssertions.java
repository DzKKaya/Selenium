package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BestBuyAssertions {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
   @Test
    public void test1(){
        driver.get(" https://www.bestbuy.com/");
        String expectesUrl="https://www.bestbuy.com/";
        String actualUrl=driver.getCurrentUrl();

       Assert.assertEquals(expectesUrl,actualUrl);

   }
   @Test
   public void test2(){
       driver.get(" https://www.bestbuy.com/");
       String istenmeyenKelime="Rest";
       String actualTitle=driver.getTitle();
       Assert.assertFalse(actualTitle.contains(istenmeyenKelime));

   }
    @Test
    public void test3(){
        WebElement logo=driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());

    }
    @Test
    public void test4(){
        WebElement francaisElementi=driver.findElement(By.xpath("//button[@lang ='fr']"));
        Assert.assertTrue(francaisElementi.isDisplayed());
}}
