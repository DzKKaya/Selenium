package practice3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Q09_Alert extends TestBase {
    @Test
    public void test01() {
        //    go to url :http://demo.automationtesting.in/Alerts.html
        driver.get("http://demo.automationtesting.in/Alerts.html");
        //    click  "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        //    accept Alert(I am an alert box!) and print alert on console
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
        driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']")).click();
        //    cancel Alert  (Press a Button !)
        driver.switchTo().alert().dismiss();
        //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
        //    and then sendKeys 'TechProEducation' (Please enter your name)
        driver.switchTo().alert().sendKeys("TechProEducation");
        driver.switchTo().alert().accept();
        //    finally print on console this message "Hello TechproEducation How are you today"
        String expectedMessage="Hello TechProEducation How are you today";
        WebElement consoleMessage=driver.findElement(By.xpath("//p[@id='demo1']"));
        String actualMessage=consoleMessage.getText();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(consoleMessage));

        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
