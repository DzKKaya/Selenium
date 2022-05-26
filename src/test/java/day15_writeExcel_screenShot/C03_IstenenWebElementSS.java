package day15_writeExcel_screenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_IstenenWebElementSS extends TestBase {

    @Test
    public void webElementSS() throws IOException {

        driver.get("https://www.amazon.com");

        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella", Keys.ENTER);


        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYYMMddHHmmss");
        String tarih=date.format(dtf);
        WebElement sonucElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        // TakesScreenshot ts= (TakesScreenshot) sonucElementi; ts, yerine sonuc da yazilabilir.

        File sonucResmi=new File("target/ScreenShot/amazonResmi"+tarih+".jpeg");

        File sonuResmiGecici=sonucElementi.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(sonuResmiGecici,sonucResmi);

    }
}
