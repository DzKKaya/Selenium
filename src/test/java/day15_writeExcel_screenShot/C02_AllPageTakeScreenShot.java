package day15_writeExcel_screenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_AllPageTakeScreenShot extends TestBase {


    @Test
    public void tumSayfa() throws IOException {
        driver.get("https://www.best.com");
        TakesScreenshot ts=(TakesScreenshot)driver;

        LocalDateTime date= LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYYMMddHHmmss");
        String tarih=date.format(dtf);
        System.out.println(dtf);
        File amazonResmi=new File("target/ScreenShot/amazonResmi"+tarih+".jpeg");

        File amazonResmiGecici=ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(amazonResmiGecici,amazonResmi);

    }
}
