package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMetodlari {
    public static void main(String[] args) {
        /*
1- amazon.com'a gidip arama kutusunu locate edin
2- arama kutusunun tagName'inin input oldugunu test edin
3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin
 */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
       //String expectedTagname="input";
       //String actualTagname=aramaKutusu.getTagName();

        if(aramaKutusu.getTagName().equals("input")) {
            System.out.println("tagname testi PASSED");
        } else {
            System.out.println("tagname testi FAILED");
        }
        if(aramaKutusu.getAttribute("name").equals("field-keywords")){
            System.out.println("Attribute testi PASSED");
        } else {
            System.out.println("Attribute testi FAILED");
        }
        driver.close();
        }

    }

