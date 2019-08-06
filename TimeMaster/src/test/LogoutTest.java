import com.codeborne.selenide.WebDriverRunner;
import context.driver.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.LogoutSteps;

import static com.codeborne.selenide.Selenide.sleep;
import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class LogoutTest {
    LogoutSteps logoutSteps;
    WebDriver driver;
    LoginSteps loginSteps;

    @Before()
    public void preparing() {
        setProperties();
        loginSteps = new LoginSteps();
        logoutSteps = new LogoutSteps();
        setup();
        driver = DriverFactory.getDriver();
//        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver); // пропихиваем драйвер селениду через getWebDriver() можно получить текущий драйвер
        driver.get(properties.getProperty("TM_URI"));
    }

    @Test
    public void LogoutTest() {
        loginSteps.loginWithDefaultCreds();
        logoutSteps.submit();
        sleep(5000);
       logoutSteps.checkThatUserNotOnMainPage();

//       sleep(10000); // берем таймаут посмотреть что мы реально разлогинились
    }


    @After
    public void endTest() {
        driver.close();
    }
}
