package timemaster.loginPage;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Slf4j
public class LogoutPage1 {
    SelenideElement button_submit;

    public LogoutPage1() {
//        button_submit = $("input[type = \"submit\"]");
        button_submit = $(new Selectors.ByText("Logout"));
            }
    public void submit() {
        log.info("click on the button \"Submit\"");
        button_submit.click();
    }
}