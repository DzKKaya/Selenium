package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /* En ilkle haliyle bir otomasyonu yapmak için
  Classımıza otomasyon için gerekli olan webdriver'in yerini göstermemniz gerekir.
  bunun için java kutuphanesinden System.setProperty() methodunu kullaniriz...
  method 2 parametre istemektedir.
 --> ilki kullanacagımız driver : webdriver.chrome.driver
 --> ikincisi ise bu diriverin fiziki yolu : src/resources/drivers/chromedriver.exe */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        driver.get("https://facebook.com");
        driver.getTitle();
        System.out.println(driver.getCurrentUrl());
        //  driver.close();
    }
}
