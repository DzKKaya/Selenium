package day08_alerts;

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

public class C04_Iframe {

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

    //driver.close();
}

//Bir metod olusturun: iframeTest
@Test
    public void iframeTest(){
    // https://the internet.herokuapp.com/iframe adresine gidin.
    driver.get("https://the-internet.herokuapp.com/iframe");

//○“An IFrame containing….” textini n erisilebilir oldugunu test edin ve konsolda yazdirin.
    WebElement baslikElementi=driver.findElement(By.xpath("//h3"));
    Assert.assertTrue(baslikElementi.isEnabled());
    System.out.println(baslikElementi.getText());

//○Text Box’a “Merhaba Dunya!” yazin.
    WebElement iframe= driver.findElement(By.id("mce_0_ifr"));
    driver.switchTo().frame(iframe);
    WebElement textKutusu= driver.findElement(By.xpath("//body[@id='tinymce']"));
    textKutusu.clear();
    textKutusu.sendKeys("deniz");



//○TextBox’in altinda bulunan “Elemental Selenium” linkini textini n gorunur oldugunu
    driver.switchTo().parentFrame();
    driver.switchTo().defaultContent();
    WebElement ecpectedResultYazisi=driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
    //   dogrulayin ve konsolda yazdirin.
    Assert.assertTrue(ecpectedResultYazisi.isDisplayed());
    System.out.println(ecpectedResultYazisi.getText());


}
}
