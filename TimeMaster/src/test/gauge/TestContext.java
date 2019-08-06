package gauge;

import com.codeborne.selenide.WebDriverRunner;
import com.thoughtworks.gauge.BeforeScenario;
import context.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.VacationsSteps;

import java.util.concurrent.TimeUnit;

import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class TestContext {

    VacationsSteps vacationsSteps;
    LoginSteps loginSteps;
    WebDriver driver;

    @BeforeScenario
    public void befor(){
        setProperties();
        loginSteps = new LoginSteps();
        setup();
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver); // пропихиваем драйвер селениду через getWebDriver() можно получить текущий драйвер
        driver.get(properties.getProperty("TM_URI"));
    }
}
