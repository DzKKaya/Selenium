package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    public static void main(String[] args) {
        // ...Exercise3...
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//fill the firstname

        WebElement cerez=driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']"));
        cerez.click();
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));

        firstname.sendKeys("Ali");
        //fill the lastname
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.click();
        lastname.sendKeys("Veli");
//check the gender
        WebElement gender=driver.findElement(By.xpath("//input[@id='sex-0']"));
        gender.click();
//check the experience
        WebElement experience=driver.findElement(By.xpath("//input[@id='exp-6']"));
        experience.click();
//fill the date
        WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("01.02.1980");
//choose your profession -> Automation Tester
        WebElement profession=driver.findElement(By.xpath("//input[@id='profession-1']"));
        profession.click();
//choose your tool -> Selenium Webdriver
        WebElement tool=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
        tool.click();

//choose your continent -> Antartica
        WebElement continent=driver.findElement(By.xpath("//*[text()='Antartica']"));
        continent.click();
//choose your command  -> Browser Commands
        WebElement command=driver.findElement(By.xpath("//*[text()='Navigation Commands']"));
        command.click();

//click submit button
        WebElement button=driver.findElement(By.className("btn btn-info"));
        button.submit();
    }
}
