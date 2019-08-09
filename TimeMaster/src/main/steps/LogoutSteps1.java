package steps;


import com.thoughtworks.gauge.Step;
import timemaster.loginPage.LogoutPage1;

import static com.codeborne.selenide.WebDriverRunner.url;
import static context.utils.SetProperty.properties;
import static org.assertj.core.api.Assertions.assertThat;

public class LogoutSteps1 {
    LogoutPage1 page = new LogoutPage1();
    public void submit(){
        page.submit();
    }
    public void checkThatUserNotOnMainPage() {
        assertThat(url()).isNotEqualTo(properties.getProperty("TM_URI"));
    }

    @Step("test")
    public void test(){
        System.out.println("УРА");
    }
}