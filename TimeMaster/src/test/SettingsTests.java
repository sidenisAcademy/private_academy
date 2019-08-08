import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import context.driver.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.SettingsSteps;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.url;
import static context.driver.DriverContext.setup;
import static context.utils.SetProperty.properties;
import static context.utils.SetProperty.setProperties;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SettingsTests {

    LoginSteps loginSteps;
    WebDriver driver;
    SettingsSteps setSteps;

    @Before()
    public void preparing() {
        setProperties();
        loginSteps = new LoginSteps();
        setSteps = new SettingsSteps();
        setup();
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        WebDriverRunner.setWebDriver(driver); // пропихиваем драйвер селениду через getWebDriver() можно получить текущий драйвер
        driver.get(properties.getProperty("TM_URI"));
    }

    @Test
    public void checkThatUserOnSettingsPage() {
        loginSteps.loginWithDefaultCreds();
        setSteps.initializePage();
        //setSteps.setPreviousBreakValue();
//        assertThat(url()).isEqualTo("https://timemaster-dev2.sidenis.local/settings");  // проверяем совпадение строк,но лучше не ассертами,  аотдельным методом
        setSteps.SettingValidation();
    }

    @Test
    public void checkThatPreviousBreakSet() {
        loginSteps.loginWithDefaultCreds();  //эта часть избыточная, её можно отправить в before
        setSteps.initializePage();
        setSteps.setPreviousBreakValue();
        setSteps.getBreakValue();
        assertThat(setSteps.isBreakInputEnabled()).isFalse();  // проверяем свойством isFalse что поле не позволяет ничего вводить
    }

    @Test
    public void checkUserBreakValueIsSet() {
        loginSteps.loginWithDefaultCreds();
        setSteps.initializePage();
        setSteps.setUserBreakValue();
        assertThat(setSteps.getBreakValue()).isEqualTo("0:60");
    }

    @After
    public void endTest() {
        driver.close();
    }
}
