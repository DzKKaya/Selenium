package practice2;

import com.sun.source.tree.IfTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class Q7 extends TestBase {

    @Test
    public void assertTest(){

        // ●Bir class olusturun: IframeTest 02
        //         1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        //         2) sayfadaki iframe sayısını bulunuz.

        //         3)
        // ilk iframe'deki (Youtube) play butonuna tıklayınız.
        //         4)
        // ilk iframe'den çıkıp ana sayfaya dönünüz
        //         5)
        // ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live selenium project.html)
        // tıklayınız




    }



}
