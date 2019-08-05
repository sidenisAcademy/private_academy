package steps;

import timemaster.loginPage.LoginPage;

import static com.codeborne.selenide.WebDriverRunner.url;
import static context.utils.SetProperty.properties;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginSteps {

    LoginPage page = new LoginPage();

    public void setDefaultUserName(){
        page.setEmail(properties.getProperty("USER_NAME"));
    }

    public void setDefaultPassword(){
        page.setPassword(properties.getProperty("USER_PASSWORD"));
    }

    public void submit(){
        page.submit();
    }

    public void checkThatUserOnMainPage() {
        assertThat(url()).isEqualTo(properties.getProperty("TM_URI"));
    }

    public void loginWithDefaultCreds() {
        setDefaultUserName();
        submit();
        setDefaultPassword();
        submit();
        submit();
    }
}
