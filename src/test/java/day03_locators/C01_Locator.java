package day03_locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class C01_Locator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amozon.com");
        //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusu.sendKeys("nutella"+ Keys.ENTER);


        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }

}
