package day10_actions;

import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class C05 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
     //  2 https://the internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions=new Actions(driver);

        //  3 Cizili alan uzerinde sag click yapalim
        WebElement LineArea=driver.findElement(By.id("hot-spot"));
        actions.contextClick(LineArea).perform();


        //  4 Alert’te cikan yazinin “You selected a context menu” oldugunu
        //  test edelim.
        String expecterAlert="You selected a context menu";
        String actualAlert=driver.switchTo().alert().getText();
        Assert.assertEquals(expecterAlert,actualAlert);


     //  5 Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
     //  6 Elemental Selenium linkine tiklayalim
        String fistWindowHandle= driver.getWindowHandle();
        Set<String> windowHandles=driver.getWindowHandles();
        String secondWindowHandle="";
        for (String each:
             windowHandles) {
            if(!fistWindowHandle.equals(each)){
                secondWindowHandle=each;
            }
        }
        actions.click(driver.findElement(By.xpath("//*[text()='Elemental Selenium']"))).perform();

     //  7 Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        driver.switchTo().window(secondWindowHandle);
        String expectedh1="Elemental Selenium";
        String actualh1=driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).getText();
        Assert.assertTrue(actualh1.contains(expectedh1));


        Thread.sleep(10000);

    }
}