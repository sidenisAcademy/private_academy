package gauge;

import com.codeborne.selenide.WebDriverRunner;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import context.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.LogoutSteps;

import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class TestContext {

    LoginSteps loginSteps;
    LogoutSteps logoutSteps;
    WebDriver driver;

    @BeforeScenario
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

    @AfterScenario
    public void endTest() {
        driver.close();
    }
}