package Trefilova.Selenium;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    @BeforeClass
    public static void setProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
    }

    @Test
    public void firstUITest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }

    @Test
    public void CSSTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
        element.sendKeys(Keys.ENTER);
        driver.close();
    }

    @Test
    public void CSSTest2() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/ru");
        WebElement search = driver.findElement(By.cssSelector("input[name='q']"));
        search.sendKeys("Selenide");
        search.submit();
        WebElement link = driver.findElement(By.cssSelector("div:nth-child(1) > div > div:nth-child(1) > div > div > div > a > h3"));
        link.click();
        System.out.println(driver.getTitle());
    }

    @Test
    public void XpathTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement pictures = driver.findElement(By.xpath("(//a[@class='gb_e'])[2]"));
        pictures.click();
        WebElement searchPic = driver.findElement(By.xpath("//input[@name='q']"));
        searchPic.sendKeys("котики");
        WebElement searchButton = driver.findElement(By.xpath("//button[@jsname='Tg7LZd']"));
        searchButton.click();
        driver.close();
    }

    @Test
    public void XpathTest2() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement keyboard = driver.findElement(By.xpath("//span[@class='MiYK0e']"));
        keyboard.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<String> letters = new ArrayList<>();
        letters.add("'K71'");
        letters.add("'K72'");
        letters.add("'K66'");
        letters.add("'K68'");
        letters.add("'K84'");
        letters.add("'K78'");
        letters.add("'K32'");
        letters.add("'K86'");
        letters.add("'K66'");
        letters.add("'K72'");

        for(String code : letters) {
            WebElement letter = driver.findElement(By.xpath("//button[@id=" + code + "]"));
            letter.click();
        }

        WebElement element = driver.findElement(By.name("q"));
        element.submit();

//        WebElement letter1 = driver.findElement(By.xpath("//button[@id='K71']"));
//        letter1.click();
//        WebElement letter2 = driver.findElement(By.xpath("//button[@id='K72']"));
//        letter2.click();
//        WebElement letter3 = driver.findElement(By.xpath("//button[@id='K66']"));
//        letter3.click();
    }
}
