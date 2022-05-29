package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class Q07_DropDown extends TestBase {
    @Test
    public void dropDown() {
        // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        //-->Task1 Find Dropdown on Multi Selection
        WebElement mSelection=driver.findElement(By.xpath("//*[@id='justAnInputBox']"));
        Select select=new Select(mSelection);
        List<WebElement>options=select.getOptions();
        options.stream().forEach(t->System.out.println(t.getText()));
        mSelection.click();
        //-->Task2 Find  all Dropdown Elements on page

        
        List<WebElement> allDDE=driver.findElements(By.xpath("//*[@class='comboTreeItemTitle']"));
        allDDE.stream().map(t->t.getText()).forEach(System.out::println);

        List<WebElement> dropDown=driver.findElements(By.xpath("//*[@class='ComboTreeItemParent']"));
        dropDown.stream().forEach(t->System.out.println(t.getText()+ " "));
        //-->Task3 printout DropDown Elements' number
        System.out.println("DropDown Element'leri sayisi :"+dropDown.size());
        //-->Task4 choose dropdown elements and printout dropdown elements' name  until choise 6


    }






}
