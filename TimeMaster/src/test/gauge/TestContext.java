package gauge;

import com.codeborne.selenide.WebDriverRunner;
import com.thoughtworks.gauge.BeforeScenario;
import context.driver.DriverFactory;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.SettingsSteps;

import java.util.concurrent.TimeUnit;

import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class TestContext {
    LoginSteps loginSteps;
    WebDriver driver;
    SettingsSteps setSteps;

    @BeforeScenario
    public void preparing() {
        setProperties();
        loginSteps = new LoginSteps();
        setSteps = new SettingsSteps();
        setup();
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver); // пропихиваем драйвер селениду через getWebDriver() можно получить текущий драйвер
        driver.get(properties.getProperty("TM_URI"));
    }
}
