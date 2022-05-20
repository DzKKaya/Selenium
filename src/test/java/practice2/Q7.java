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

import java.time.Duration;
import java.util.List;

public class Q7 {
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
    public void assertTest(){
        driver.get("https://www.java2blog.com");
        Actions actions=new Actions(driver);
        WebElement iconElement=driver.findElement(By.xpath("//i[@class='material-icons']"));
        actions.click(iconElement).perform();

        WebElement searchBox=driver.findElement(By.xpath("//input[@type='search']"));
        actions.click(searchBox).sendKeys("assert",Keys.ENTER).perform();


    }
    // ●Bir class olusturun: IframeTest 02
    //         1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
    //         2) sayfadaki iframe sayısını bulunuz.
    //         3)
    // ilk iframe'deki (Youtube) play butonuna tıklayınız.
    //         4)
    // ilk iframe'den çıkıp ana sayfaya dönünüz
    //         5)
    // ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live selenium project.html)
    // tıklayınız


}
