package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        driver.close();
        //CDwindow-A67AFB71BB0F19F27F6DD55671D01615
        //her acilan sayfanin kendine ait bir hashcode vardir.
        //getWindowHandle bu hashcode verir.
    }
}
