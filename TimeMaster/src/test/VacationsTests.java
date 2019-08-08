import com.codeborne.selenide.WebDriverRunner;
import context.driver.DriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.VacationsSteps;

import java.util.concurrent.TimeUnit;

import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;

public class VacationsTests {
    VacationsSteps vacationsSteps;
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
    }

//    @Test
//    public void createVacationWithoutUnpaidLeaveTest() {
//        vacationsSteps.createVacationWithoutUnpaidLeave("15 Aug 2019", "20 Sep 2019");
//    }
}
