package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        //amazon sitesine gidip kaynak kodlarinda "spend less" yazdigini test edin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari=driver.getPageSource();
        String arananKelime="desktop";
        if(sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak kodunda " +arananKelime+" var Test PASSED");
        }else{
            System.out.println("Kaynak kodunda " +arananKelime+" yok test FAILED");
        }
        driver.close();

    }
}
