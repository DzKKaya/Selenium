package slaytPractice;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.io.*;
import java.time.Duration;
import java.util.List;

public class Q02 extends TestBase {

    @Test
    public void name() throws IOException {
//1. https://www.n11.com/ adresine gidilerek headerdan “Mağazalar/Mağazaları Gör”
//seçilir.

        driver.get("https://www.n11.com");

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement tamamElementi=wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.id("myLocation-close-info")));
        tamamElementi.click();

        WebElement dahaSonraElementi= wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[text()='Daha Sonra']")));
        dahaSonraElementi.click();
        Actions actions=new Actions(driver);
        WebElement magazalar=driver.findElement(By.xpath("//*[@class='hBotMenuItem hTMItem hasMenu']"));
        actions.moveToElement(magazalar).perform();
        //2. Tüm Mağazalar butonuna tıklanır. A harfindeki tüm mağazalar bir excel, csv veya
        WebElement magazaGor=driver.findElement(By.xpath("//*[@title='Mağazaları Gör']"));
        actions.moveToElement(magazaGor).click().perform();

        List<WebElement> aIleBaslayanMagazalar=driver.findElements(By.xpath("(//div[@class='sellerListHolder'])[4]"));

        aIleBaslayanMagazalar.stream().forEach(t->System.out.print(t.getText()+", "));


//txt dosyasına yazdırılır.

        FileInputStream fis=new FileInputStream("target/ScreenShot/aIleBaslayanMagazalar.txt");

        Workbook workbook= WorkbookFactory.create(fis);


    }
}
