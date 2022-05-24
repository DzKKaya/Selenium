package slaytPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q01_WebTables extends TestBase {

    //Bir Class olusturun D19_WebtablesHomework

    @Test
    public void test1() {
        //https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");
        //2. Headers da bulunan department isimlerini yazdirin
        List<WebElement> department=driver.findElements(By.xpath("//div/div/div/div/div/div/div/div/div/div/div[6]"));
        for (WebElement each:
             department) {
            System.out.println(each.getText());
        }

        //3. sutunun basligini yazdirin
        List<WebElement> sutunBasigi=driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
        for (WebElement each:
                sutunBasigi) {
            System.out.println(each.getText());
        }

        //4. Tablodaki tum datalari yazdirin
        List<WebElement> cell=driver.findElements(By.xpath("//div[@role='gridcell']"));

        for (WebElement each:
             cell) {
            System.out.println(each.getText());
            
        }
        //5. Tabloda kac cell (data) oldugunu yazdirin
        
        System.out.println(cell.size());
        
        //6. Tablodaki satir sayisini yazdirin
        List<WebElement>satir=driver.findElements(By.xpath("div[@class='rt-tbody']"));
        System.out.println(satir);

        System.out.println("satir sayisi :"+satir.size());
        //7. Tablodaki sutun sayisini yazdirin
        System.out.println(department.size());
        //8. Tablodaki 3.kolonu yazdirin
        department=driver.findElements(By.xpath("//div/div/div/div/div/div/div/div/div/div/div[3]"));
        for (WebElement each:
                department) {
            System.out.println(each.getText());
        }
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin

        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini
        //girdigimde bana datayi yazdirsin

    }




}
