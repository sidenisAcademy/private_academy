import com.codeborne.selenide.WebDriverRunner;
import context.driver.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.TimeTableSteps;

import java.util.concurrent.TimeUnit;

import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class TimeTableTest {

    TimeTableSteps timeTableSteps;
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
        driver.get(properties.getProperty("TM_URI"));
        loginSteps.setDefaultUserName();
        loginSteps.submit();
        loginSteps.setDefaultPassword();
        loginSteps.submit();
        loginSteps.submit();
        timeTableSteps = new TimeTableSteps();
    }
    @Test
    public void setNewBreak() {
        timeTableSteps.setBreak("0:45");
    }
    @After
    public void endTest() {
        driver.close();
    }

}
