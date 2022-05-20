package practice2;

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
import java.util.List;

public class Q3 {
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
        //driver.quit();
    }

    // http://the-internet.herokuapp.com/add_remove_elements/
    @Test
    public void test1(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        createButtons(100);
        List<WebElement>ecpecteddeleteButton=driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int b=10;
        deleteButtonsAndValidate(b);
        List<WebElement>deleteButton=driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));

        int actualDelete= ecpecteddeleteButton.size()-deleteButton.size();
        Assert.assertTrue(b==actualDelete);
    }

    private void deleteButtonsAndValidate(int b) {
        for (int i = 0; i < b ; i++) {

            driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        }

    }

    // 1.method : createButtons(100)
    public void createButtons(int a){
    for (int i = 0; i < a; i++) {
        WebElement addElementi=driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementi.click();
    }}
}


    // write a function that takes a number, and clicks the "Delete" button
    // given number of times, and then validates that given number of
    // buttons was deleted









