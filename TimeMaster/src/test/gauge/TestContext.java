package gauge;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import steps.SettingsSteps;
import com.thoughtworks.gauge.*;
import context.driver.DriverFactory;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;

import java.util.concurrent.TimeUnit;
import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class TestContext {
    LoginSteps loginSteps;
    WebDriver driver;
    SettingsSteps setSteps;

    @BeforeSuite
    public void setupSuite() {
    }

    @BeforeScenario
    public void setupScenario() {
        setProperties();
        loginSteps = new LoginSteps();
       setSteps = new SettingsSteps();
        setup();
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver);
        driver.get(properties.getProperty("TM_URI"));
    }

    @BeforeStep
    public void setupStep(ExecutionContext context) {
    }

    @AfterStep
    public void teardownStep(ExecutionContext context) {
    }

    @AfterScenario
    public void teardownScenario(ExecutionContext context) {
        driver.close();
}
}
