package practice2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Q4_interview extends TestBase {
    @Test
    public void test01() throws InterruptedException {

    ///https://www.teknosa.com/ adresine gidiniz

       driver.get("https://www.teknosa.com");
  //    arama cubuguna oppo yazip enter deyiniz
        WebElement searcBoxTek= driver.findElement(By.xpath("//input[@id='search-input']"));
        searcBoxTek.sendKeys("oppo", Keys.ENTER);

  // sonuc sayisini yazdiriniz
        WebElement resault=driver.findElement(By.xpath("//div[@class='plp-info']"));
        System.out.println("Sonuç sayisi: " +resault.getText());
        // cikan ilk urune tiklayiniz

        WebElement firstProduct=driver.findElement(By.xpath("(//a[@class='prd-link'])[1]"));
        firstProduct.click();
        // sepete ekleyiniz
        driver.findElement(By.id("addToCartButton")).click();
  // sepetime git e tiklayiniz
        driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
  // consol da "Sipariş Özeti" webelementinin text ini yazidiriniz

  // Alisverisi tamamlayiniz
        driver.findElement(By.xpath("//a[@class='btn btn-primary js-checkout-controls']")).click();
  // son alarak da "Teknosa'ya hoş geldiniz"  webelementinin text ini yazidiriniz
        WebElement hosGeldiniz=driver.findElement(By.xpath("(//div[@class='lrl-title'])[1]"));
        System.out.println(hosGeldiniz.getText());
        // driver i kapatiniz
Thread.sleep(6000);
driver.close();


    }

    //Not : https://www.guru99.com/chrome-options-desiredcapabilities.html

    /*
    note :
    JavaScriptExecutor nedir?
    JavaScriptExecutor, JavaScript'i Selenium Web sürücüsü aracılığıyla çalıştırmaya yardımcı olan bir Arayüzdür.
    JavaScriptExecutor, javascript'i seçilen pencerede veya geçerli sayfada çalıştırmak için "executescript" ve "executeAsyncScript"
    olmak üzere iki yöntem sunar.

    JavaScriptExecutor'a neden ihtiyacımız var?
    Selenium Webdriver'da, bir web sayfasındaki işlemleri tanımlamak ve gerçekleştirmek için
    XPath, CSS vb. gibi konum belirleyiciler kullanılır.
    Bu konum belirleyicilerin çalışmaması durumunda JavaScriptExecutor'ı kullanabilirsiniz.
    Bir web öğesinde istenen bir işlemi gerçekleştirmek için JavaScriptExecutor'ı kullanabilirsiniz.
    Selenium, javaScriptExecutor'ı destekler. Ekstra bir eklenti veya eklentiye gerek yoktur.
    JavaScriptExecutor kullanmak için komut dosyasında (org.openqa.selenium.JavascriptExecutor) içe aktarmanız yeterlidir.

            executeScript aracılığıyla sayfayı 1000 piksel kaydırın.
            Javascript yöntemi ScrollBy(), web sayfasını belirli piksel sayısına kaydırır.

            ScrollBy() yöntemlerinin sözdizimi şöyledir:
            executeScript("window.scrollBy(x-piksel,y-piksel)");  ya da js.executeScript("scroll(x,y);");
            x-piksel x eksenindeki sayıdır, sayı pozitifse sola, sayı negatifse sağa hareket eder.
            y-piksel y eksenindeki sayıdır, sayı pozitifse ise aşağı doğru,sayı negatif ise yukarı doğru hareket eder.

            Örnek:
            js.executeScript("window.scrollBy(0,1000)"); // Dikey olarak 1000 piksel aşağı kaydır
     */

}
