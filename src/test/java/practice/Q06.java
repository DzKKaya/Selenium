package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q06 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @After
    public void tearDown(){
        //driver.quit();
    }
    @Test
    public void test1(){

   // 1.  https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
    //2.  Bir mail adersi giriniz
        WebElement mail=driver.findElement(By.id("email"));
        mail.sendKeys("dzkk@gmail.com");
   // 3.  Bir password giriniz
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("dkaldjaj");
   // 4.  Login butonuna tiklayiniz
       WebElement login=driver.findElement(By.xpath("//button[@name='commit']"));
       login.click();

   // 5.  "There was a problem with your login." texti gorunur ise
        WebElement problem=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));

   // 6.  "kayit yapilamadi" yazdiriniz
        if(problem.isDisplayed()){
            System.out.println("kayit yapilamadi");
        }else{
            System.out.println("kayit yapildi");
        }
   // 8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
   // 9.  Tum sayfalari kapatiniz

    }

}
