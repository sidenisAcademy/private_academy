package steps;


import timemaster.loginPage.LogoutPage;

import static com.codeborne.selenide.WebDriverRunner.url;
import static context.utils.SetProperty.properties;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LogoutSteps {
    LogoutPage page = new LogoutPage();
    public void submit(){
        page.submit();
    }
    public void checkThatUserNotOnMainPage() {
        assertThat(url()).isNotEqualTo(properties.getProperty("TM_URI"));
    }
}