package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
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
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculate under Micro Apps
        WebElement calculate= driver.findElement(By.xpath("//a[@id='calculate']"));
        calculate.click();

        //    Type any number in the first input
        WebElement number1=driver.findElement(By.id("number1"));
        number1.sendKeys("2");

        //    Type any number in the second input
        WebElement number2=driver.findElement(By.id("number2"));
        number2.sendKeys("5");

        // Click on Calculate
        WebElement cCalculate=driver.findElement(By.xpath("//input[@type='submit']"));
        cCalculate.click();

        // Get the result
        WebElement result=driver.findElement(By.xpath("//span[@id='answer']"));
        int sonuc=Integer.parseInt(result.getText());
        // Print the result
        System.out.println(sonuc);

        Assert.assertEquals(7, sonuc);

    }












        }



