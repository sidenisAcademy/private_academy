package Isabekov.Day15;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium {
    @Test
    public void firstUITest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emil.Isabekov\\Desktop\\JAVA\\REP\\privat_academy\\src\\main\\resources/chromedriver.exe"); //создаем наш драйвер на основе WebDrivre
        WebDriver driver = new ChromeDriver(); // наш новый драйвер
        driver.get("http://www.google.com/ru");
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 //       WebElement element = driver.findElement(By.name("q")); // ищем элемент для того чтобы начать с ним потом взаиможействовать
        WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
 //       element.sendKeys("Cheese!");  //отправляем строку
        element.click();
//        element.sendKeys(Keys.ENTER);
//        element.submit();  // можно отправить даже ctrl, alt
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }
    @Test
    public void secondUITest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emil.Isabekov\\Desktop\\JAVA\\REP\\privat_academy\\src\\main\\resources/chromedriver.exe"); //создаем наш драйвер на основе WebDrivre
        WebDriver driver = new ChromeDriver(); // наш новый драйвер
        driver.get("http://www.google.com/ru");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
          WebElement element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")); // ищем элемент для того чтобы начать с ним потом взаиможействовать
 //       WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
        element.sendKeys("Selenide");  //отправляем строку
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        //       element.click();
//        element.sendKeys(Keys.ENTER);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3"));
        element1.click();
   //      element1.submit();  // можно отправить даже ctrl, alt
        System.out.println("Page title is: " + driver.getCurrentUrl());
       driver.close();
    }

}
