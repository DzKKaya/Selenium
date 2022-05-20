package day04_yxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='added-manually']"));

        if(deleteButonu.isDisplayed());

    }
}
