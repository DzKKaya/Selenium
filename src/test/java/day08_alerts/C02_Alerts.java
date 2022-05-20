package day08_alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Alerts {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
    @Test
    public void acceptAlert() {

        //      ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        //      “You successfully clicked an alert” oldugunu test edin.
        driver.switchTo().alert().accept();
        String ecpectedResultYazisi="You successfully clicked an alert";
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//p[@id='result']"));
        String actualResultYazisi=sonucYaziElementi.getText();
        Assert.assertEquals(ecpectedResultYazisi,actualResultYazisi);

    }
    @Test
    public void dismissAlert() {
    //● Bir metod olusturun: dismissAlert
    //      ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
    //      “successfuly” icermedigini test edin.
        String istenmeyenKelime="successfuly";
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//p[@id='result']"));
        String actualResultYazisi=sonucYaziElementi.getText();
        Assert.assertFalse(actualResultYazisi.contains(istenmeyenKelime));

}
    @Test
    public void sendKeysAlert() {

        //● Bir metod olusturun: sendKeysAlert
        //      ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        //      OK butonuna     tıklayın
        driver.switchTo().alert().sendKeys("deniz");
        driver.switchTo().alert().accept();
         //result mesajında isminizin görüntülendiğini doğrulayın.
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//p[@id='result']"));

        String actualResultYazisi=sonucYaziElementi.getText();
        Assert.assertTrue(actualResultYazisi.contains("deniz"));

    }

}
