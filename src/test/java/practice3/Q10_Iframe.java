package practice3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class Q10_Iframe  extends TestBase {
    @Test
    public void iframeClass() {
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
       driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);
        Actions actions=new Actions(driver);
        WebElement ayi=driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));

        // ikinci emojiye tıklayın
        actions.moveToElement(ayi).click().perform();
        // tüm ikinci emoji öğelerini tıklayın
        List<WebElement> tumEmoji=driver.findElements(By.xpath("//div[@class='mdl-tabs__panel is-active']//div//img"));
        tumEmoji.stream().forEach(t->t.click());

        // parent iframe e geri donun
        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        //  apply button a basin

    }

}
