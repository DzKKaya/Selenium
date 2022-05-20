package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    public static void main(String[] args) {
        //  ...Exercise2...
//  1-driver olusturalim
        WebDriverManager.chromedriver().setup();
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");

//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
    boolean otoUrl=driver.getCurrentUrl().contains("Oto");
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
    if (otoUrl){
    System.out.println("Sahibinden Url Oto kelimesi iceriyor");
    }else{
    System.out.println("Sahibinden Url Oto kelimesi icermiyor");
    }
        boolean otoTitle=driver.getTitle().contains("Oto");

        if (otoTitle){
            System.out.println("Sahibinden Title Oto kelimesi iceriyor");
        }else{
            System.out.println("Sahibinden Title Oto kelimesi icermiyor");
        }



//  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com" );
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim

        if (driver.getTitle().contains("Sitesi")){
            System.out.println("Gittigidiyor Title Sitesi kelimesi iceriyor");
        }else{
            System.out.println("Gittigidiyor Title Sitesi kelimesi icermiyor");
        }
//  10-Bi onceki web sayfamiza geri donelim

        driver.navigate().back();
//  11-sayfayi yenileyelim
        driver.navigate().refresh();
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }
}
