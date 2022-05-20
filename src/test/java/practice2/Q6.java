package practice2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;
import java.security.KeyFactorySpi;
import java.time.Duration;
import java.util.List;

public class Q6 {
    static  WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

    @Test
    public void test1(){
        // 1. Amazon.com'a gidelim.
        driver.get("https://amazon.com");
        // 2. DropDown üzerinde Books secelim.(All yazan yerde)
        Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
        List<WebElement> options=select.getOptions();
//    kategorilerin hepsini konsola yazdiralim
        for (WebElement each:
             options) {
            System.out.print("- "+each.getText());
        }
// 3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
   WebElement searcBox=driver.findElement(By.id("twotabsearchtextbox"));
        searcBox.sendKeys("Les Miserables", Keys.ENTER);

        WebElement searchResult=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String searchResult1[]=searchResult.getText().split(" ");
        // 4. Sonuc sayisini ekrana yazdiralim.
        System.out.println("");
        System.out.println(searchResult1 [3]);
// 5. Sonucların Les Miserables i icerdigini assert edelim

String ecpectedText="Les Miserables";
String actualText=searchResult.getText();

        Assert.assertTrue(actualText.contains(ecpectedText));
    }

}