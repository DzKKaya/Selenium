package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05 {
    WebDriver driver;
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test1(){

       // Navigate to website
       driver.get("https://testpages.herokuapp.com/styled/index.html");

       // Under the  ORIGINAL CONTENTS

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1900)");

       // click on Alerts
        driver.findElement(By.xpath("//a[@href='/alerts.html']")).click();

        // print the URL
        System.out.println(driver.getCurrentUrl());

       // navigate back
        driver.navigate().back();

       // print the URL
        System.out.println(driver.getCurrentUrl());

       // Click on Basic Ajax
        driver.findElement(By.xpath("//a[@href='/basic_ajax.html']")).click();

       // print the URL
        System.out.println(driver.getCurrentUrl());

       // enter value-> 20 and Enter
        driver.findElement(By.id("lteq30")).sendKeys("20", Keys.ENTER);

       // and then verify Submitted Values is displayed open page

        WebElement submitted=driver.findElement(By.xpath("//p[text()='Submitted Values']"));
        Assert.assertTrue(submitted.isDisplayed());

    }


}
