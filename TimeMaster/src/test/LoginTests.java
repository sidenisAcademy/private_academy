import com.codeborne.selenide.WebDriverRunner;
import context.driver.DriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;

import java.util.concurrent.TimeUnit;

import static context.driver.DriverContext.setup;

public class LoginTests {

    LoginSteps loginSteps;
    WebDriver driver;


    @Before()
    public void preparing() {
        loginSteps = new LoginSteps();
        setup();
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver);
    }

    @Test
    public void PageAfterLoginTest(){
        loginSteps.setDefaultUserName();
        loginSteps.setDefaultPassword();
        loginSteps.submit();
        loginSteps.checkThatUserOnMainPAge(driver.getCurrentUrl());
    }
}
