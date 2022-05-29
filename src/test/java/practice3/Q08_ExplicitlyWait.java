package practice3;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Q08_ExplicitlyWait extends TestBase {
    @Test
    public void test01() {
        //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
        driver.get("https://www.jqueryscript.net/demo/bootstrap-alert-box/");

        //maximize the window

        //click on action dialog button
        WebElement actionElement=driver.findElement(By.xpath("//button[text()='Action Dialog']"));
        actionElement.click();
        //if need use explicitly wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        //click on the ok button
        WebElement okElement=driver.findElement(By.xpath("//button[text()='Ok']"));
        wait.until(ExpectedConditions.visibilityOf(okElement));
        okElement.click();

        //accept the alert message
        driver.switchTo().alert().accept();

    }


}


