package Isabekov.Day15;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    @Test
    public void firstUITest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emil.Isabekov\\Desktop\\JAVA\\REP\\privat_academy\\src\\main\\resources/chromedriver.exe"); //создаем наш драйвер на основе WebDrivre
        WebDriver driver = new ChromeDriver(); // наш новый драйвер
        driver.get("http://www.google.com");
 //       WebElement element = driver.findElement(By.name("q")); // ищем элемент для того чтобы начать с ним потом взаиможействовать
        WebElement element = driver.findElement(By.cssSelector("body.hp.vasq.big:nth-child(2) div.ctr-p:nth-child(4) div.jhp.big:nth-child(4) form.tsf.nj:nth-child(5) div:nth-child(2) div.A8SBwf div.FPdoLc.VlcLAe:nth-child(4) center:nth-child(1) > input.RNmpXc"));
 //       element.sendKeys("Cheese!");  //отправляем строку
        element.submit();  // можно отправить даже ctrl, alt
        System.out.println("Page title is: " + driver.getTitle());
 //       driver.close();
    }

}
