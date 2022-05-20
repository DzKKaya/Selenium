package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";

        if(actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title "+arananKelime+ "'yi içermiyor, title testi FAILED");
        }
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("actual Url:"+actualUrl+" beklenen Url'den farkli, Url testi FAILED");
        }
        driver.close();

    }
}
