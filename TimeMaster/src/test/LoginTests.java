import com.codeborne.selenide.WebDriverRunner;
import context.driver.DriverFactory;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps1;

import java.util.concurrent.TimeUnit;

import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class LoginTests1 {

    LoginSteps1 loginSteps;
    WebDriver driver;


    @Before()
    public void preparing() {
        setProperties();
        loginSteps = new LoginSteps1();
        setup();
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver); // пропихиваем драйвер селениду через getWebDriver() можно получить текущий драйвер
        driver.get(properties.getProperty("TM_URI"));
    }

    /***   @Test
    public void test() {
        driver.get("http://www.google.com");
        SelenideElement el = $(By.name("q"));
        el.sendKeys("Hello world!");
        el.submit();
        System.out.println("Page title is: " + driver.getTitle());
     }*/

    @Test
    public void PageAfterLoginTest() {
        loginSteps.setDefaultUserName();
        loginSteps.submit();
        loginSteps.setDefaultPassword();
        loginSteps.submit();
        loginSteps.submit();
        loginSteps.checkThatUserOnMainPage();
    }

//    @Test
//    public void LogoutTest() {
//        LogoutSteps.submit();
//    }

    @After
    public void endTest() {
        driver.close();
    }
}
