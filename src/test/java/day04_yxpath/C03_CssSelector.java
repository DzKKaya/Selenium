package day04_yxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://a.testaddressbook.com/sign_in");

//        WebElement email=driver.findElement(By.xpath("//input[@data-test='email']"));
  //      WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
    //    WebElement signin=driver.findElement(By.xpath("//input[@value='Sign in']"));

        WebElement email=driver.findElement(By.cssSelector("input'email']"));
        WebElement password=driver.findElement(By.cssSelector("input[type='password']"));
        WebElement signin=driver.findElement(By.cssSelector("input[value='Sign in']"));


        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();
    }
}
