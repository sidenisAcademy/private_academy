package Kutsenko;

public class SeleniumTest {

    @Test
    public void firstUITest() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resourсes/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();
    }


}
