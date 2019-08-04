package steps;

import timemaster.loginPage.LoginPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginSteps {

    LoginPage page = new LoginPage();

    public void setDefaultUserName(){
        page.setEmail(System.getProperty("USER_NAME"));
    }

    public void setDefaultPassword(){
        page.setEmail(System.getProperty("USER_PASSWORD"));
    }

    public void submit(){
        page.submit();
    }

    public void checkThatUserOnMainPAge(String uri){
        assertThat(uri).isEqualTo(System.getProperty("TM_URI"));
    }
}
