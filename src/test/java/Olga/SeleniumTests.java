package Olga;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {

    private WebDriver driver;

    @Before
    public void setProp() {
        System.setProperty("webdriver.chrome.driver", "C:/QA_academy/privat_academy/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    //public void closeDriver() {
        //driver.close();
    //}

    @Test
    public void firstUITest() {
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    //"Мне повезет" button (css selector)
    public void luckyUITest() {
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe > center > input.RNmpXc"));
        //WebElement element = driver.findElement(By.cssSelector("input[data-ved = \"0ahUKEwiv57eAt-PjAhUBdJoKHUU7B0MQ19QECAo\"]"));
        //element.sendKeys(Keys.ENTER);
        element.click();
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    //Selenide search (css selector)
    public void selenideSearch() {
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.cssSelector(
                "#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
        element.sendKeys("Selenide");
        element.sendKeys(Keys.ENTER);
        WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3"));
        firstLink.click();
        System.out.println("Page url is: " + driver.getCurrentUrl());
    }

    @Test
    //Cats search (xpah selector)
    public void catsSearch() {
        driver.get("http://www.google.com");
        WebElement pictures = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a"));
        pictures.click();
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[1]/input"));
        searchField.sendKeys("котики");
        searchField.sendKeys(Keys.ENTER);
        System.out.println("Page url is: " + driver.getCurrentUrl());
    }

    @Test
    public void searchViaKeyBoard() {
        driver.get("http://www.google.com");
        WebElement keyBoard = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[2]/div[1]/span"));
        keyBoard.click();

        WebElement p = driver.findElement(By.xpath("//*[@id=\"K71\"]/span"));
        p.click();
        WebElement r = driver.findElement(By.xpath("//*[@id=\"K72\"]/span"));
        r.click();
        WebElement i = driver.findElement(By.xpath("//*[@id=\"K66\"]/span"));
        i.click();
        WebElement v = driver.findElement(By.xpath("//*[@id=\"K68\"]/span"));
        v.click();
        WebElement e = driver.findElement(By.xpath("//*[@id=\"K84\"]/span"));
        e.click();
        WebElement t = driver.findElement(By.xpath("//*[@id=\"K78\"]/span"));
        t.click();
        WebElement space = driver.findElement(By.xpath("//*[@id=\"K273\"]/span"));
        space.click();
        WebElement m = driver.findElement(By.xpath("//*[@id=\"K86\"]/span"));
        m.click();
        WebElement i = driver.findElement(By.xpath("//*[@id=\"K66\"]/span"));
        i.click();
        WebElement r = driver.findElement(By.xpath("//*[@id=\"K72\"]/span"));
        r.click();


        System.out.println("Page url is: " + driver.getCurrentUrl());
    }


}
