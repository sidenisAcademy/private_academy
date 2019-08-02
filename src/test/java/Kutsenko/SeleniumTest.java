package Kutsenko;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    @Test
    public void firstUITest() {
        System.setProperty("webdriver.chrome.driver",
                "C:/AnatA/QA-academy/privat_academy/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }

    @Test
    public void openGoogleCss() {
        System.setProperty("webdriver.chrome.driver",
                "C:/AnatA/QA-academy/privat_academy/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/ru");
        WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
        element.click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }

    @Test
    public void openGoogleXPath() {
        System.setProperty("webdriver.chrome.driver",
                "C:/AnatA/QA-academy/privat_academy/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
//        WebElement element = driver.findElement(By.xpath("//*[@id="tsf"]/div[2]/div/div[3]/center/input[2]"));
        WebElement element = driver.findElement(By.xpath(".//div[@class='FPdoLc VlcLAe']/center/input[@class='RNmpXc']"));
        element.click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }

    @Test
    public void serchSelenide() {
        System.setProperty("webdriver.chrome.driver",
                "C:/AnatA/QA-academy/privat_academy/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/ru");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenide");
        element.submit();
        driver.findElement(By.cssSelector("div.r a:first-child")).click();
        System.out.println("Page url is: " + driver.getCurrentUrl());
        driver.close();
    }

//    Перейти в гугл картинки
//    Выбить в поиск «котики»
//    Нажать кнопку поиска

    @Test
    public void serchCats() {
        System.setProperty("webdriver.chrome.driver",
                "C:/AnatA/QA-academy/privat_academy/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/ru");
        driver.findElement(By.xpath(".//div[id='gbw']")).click();
        System.out.println("Page url is: " + driver.getCurrentUrl());
        driver.close();
    }
}
