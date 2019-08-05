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

    @Test
    public void thirdUITest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emil.Isabekov\\Desktop\\JAVA\\REP\\privat_academy\\src\\main\\resources/chromedriver.exe"); //создаем наш драйвер на основе WebDrivre
        WebDriver driver = new ChromeDriver(); // наш новый драйвер
        driver.get("http://www.google.com/ru");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")); // ищем элемент для того чтобы начать с ним потом взаиможействовать
        //       WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
 //       element.sendKeys("Selenide");  //отправляем строку
        element2.click();
        System.out.println("Вот твой Гугл Картинки: " + driver.getTitle());
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[1]/input"));
        element3.sendKeys("котики");  //отправляем строку
        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/button"));
        element4.click();
        //       element.click();
//        element.sendKeys(Keys.ENTER);
//        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3"));
//        element1.click();
//        //      element1.submit();  // можно отправить даже ctrl, alt
//        System.out.println("Page title is: " + driver.getCurrentUrl());
        driver.close();
    }

    @Test
    public void forthUITest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emil.Isabekov\\Desktop\\JAVA\\REP\\privat_academy\\src\\main\\resources/chromedriver.exe"); //создаем наш драйвер на основе WebDrivre
        WebDriver driver = new ChromeDriver(); // наш новый драйвер
        driver.get("http://www.google.com/ru");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")); // ищем элемент для того чтобы начать с ним потом взаиможействовать
        //       WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
        //       element.sendKeys("Selenide");  //отправляем строку
        element2.click();
        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[2]/div[2]/span")); // ищем элемент для того чтобы начать с ним потом взаиможействовать
 // перетестировать
        element5.click();




        WebElement element6 = driver.findElement(By.xpath("//*[@id=\"K71\"]"));
        element6.click();
        WebElement element7 = driver.findElement(By.xpath("//*[@id=\"K72\"]"));
        element7.click();
        WebElement element8 = driver.findElement(By.xpath("//*[@id=\"K66\"]"));
        element8.click();
        WebElement element9 = driver.findElement(By.xpath("//*[@id=\"K68\"]"));
        element9.click();
        WebElement element10 = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/button"));
        element10.click();




       System.out.println("Результат клавиатуры: " + driver.getCurrentUrl());
        driver.close();
    }

}
