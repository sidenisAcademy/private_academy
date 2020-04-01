package timemaster.loginPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

@Slf4j
public class LoginPage {
    SelenideElement input_email;
    SelenideElement input_password;
    SelenideElement button_submit;

    public LoginPage() {
        button_submit = $("input[type = \"submit\"]");
        input_email = $("input[type = 'email']");
        input_password = $("input[name='passwd']");
    }

    public void setEmail(String email){
        input_email.waitUntil(Condition.visible, 10000); // ожидание 10 сек
        log.info("set email: " + email);
        input_email.waitUntil(Condition.visible, 10000);
        input_email.setValue(email);
    }

    public void setPassword(String password) {
        log.info("set password");
        input_password.setValue(password);
    }

    public void submit() {
        log.info("click on the button \"Submit\"");
        button_submit.click();
    }

}