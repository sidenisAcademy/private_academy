import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import context.driver.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class LoginTests {

    LoginSteps loginSteps;
    WebDriver driver;


    @Before()
    public void preparing() {
        setProperties();
        loginSteps = new LoginSteps();
        setup();
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver); // пропихиваем драйвер селениду через getWebDriver() можно получить текущий драйвер
    }

    @Test
    public void test() {
        driver.get("http://www.google.com");
        SelenideElement el = $(By.name("q"));
        el.sendKeys("Hello world!");
        el.submit();
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void PageAfterLoginTest() {
        loginSteps.setDefaultUserName();
        loginSteps.setDefaultPassword();
        loginSteps.submit();
        loginSteps.checkThatUserOnMainPAge(url());
    }

    @After
    public void endTest() {
        driver.close();
    }
}
