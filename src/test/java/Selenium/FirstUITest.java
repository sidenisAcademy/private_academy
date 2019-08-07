package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstUITest {


    @Test
    public void firstUITest() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitalii.nakhanov\\IdeaProjects" +
                "\\privat_academy\\src\\test\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        TimeUnit.SECONDS.sleep(10);
        WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
        element.click();
//        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }

    @Test
    public void secondTestSelenium() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitalii.nakhanov\\IdeaProjects" +
                "\\privat_academy\\src\\test\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        TimeUnit.SECONDS.sleep(5);
        WebElement element = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        element.sendKeys("Selenide");

        element.submit();
        TimeUnit.SECONDS.sleep(10);
        WebElement element1 = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > div.r > a"));

        element1.click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }

}
