package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    static WebDriver driver;
  // BeforeClass ile driver ı olusturun ve class icinde static yapin
  // Maximize edin, 15 sn bekletin
  // http://www.google.com adresine gidin
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public static void tearDown(){

        driver.quit();
    }

    @Before
    public void git(){
        driver.get("http://www.google.com");
    }
    //arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
    @Test
    public void greenMile(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Green Mile", Keys.ENTER);

    }
   // arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
@Test
    public void premonition(){
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Premonition", Keys.ENTER);

}
//arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
    @Test
    public void benjamin(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("The Curious Case of Benjamin Button", Keys.ENTER);

    }
    @After
    public void temizlik(){

        System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
        driver.findElement(By.xpath("//input[@name='q']")).clear();
    }
}
