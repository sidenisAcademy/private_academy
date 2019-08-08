package timemaster.vacationsPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class VacationsPage {
    SelenideElement input_find;
    SelenideElement input_year;
    SelenideElement button_create_vacation;
    SelenideElement employees_list;
    SelenideElement vacations_list;

    //create vacation form
    SelenideElement input_date_from;
    SelenideElement input_date_to;
    SelenideElement checkbox_unpaid_leave;
    SelenideElement button_close;
    SelenideElement button_create;

    SelenideElement backend_returned_code1;
    SelenideElement backend_returned_code2;

    public VacationsPage() {
        input_find = $(byXpath("//input[@id='mat-input-1']"));
        input_year = $(byXpath("//input[@id='mat-input-2']"));
        button_create_vacation = $(byText("Create vacation"));
        employees_list = $(byClassName("users-column__employees-list employees-list"));
        vacations_list = $(byClassName("table-vacations__vacations-column vacations-column"));

        input_date_from = $(byXpath("//input[@formcontrolname='dateFrom']"));
        input_date_to = $(byXpath("//input[@formcontrolname='dateTo']"));
        checkbox_unpaid_leave = $(byClassName("mat-checkbox-inner-container"));
        button_close = $(byText("CLOSE"));
        button_create = $(byText("CREATE"));

        backend_returned_code1 = $(byText(" Backend returned code 406 "));
        backend_returned_code2 = $(byText(" Backend returned code undefined "));
    }

    public void click_find(String string) {
        log.info("enter a string:");
        input_find.setValue(string);
    }

    public void set_year(String year) {
        log.info("enter a year:");
        input_year.setValue(year);
    }

    public void click_createVacation() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        log.info("click on the button \"Create vacation\"");
        button_create_vacation.click();
    }

    public void set_date_to(String date) {
        log.info("set date to: " + date);
        input_date_to.setValue(date);
    }

    public void set_date_from(String date) {
        log.info("set date from: " + date);
        input_date_from.setValue(date);
    }

    public void set_unpaid_leave() {
        log.info("click on the checkbox \"Unpaid leave\"");
        checkbox_unpaid_leave.click();
    }

    public void click_close_button() {
        log.info("click on the button \"CLOSE\"");
        button_close.click();
    }

    public void click_create_button() {
        log.info("click on the button \"CREATE\"");
        button_create.click();
    }

    public void check_backend_returned_codes() {
        backend_returned_code1.exists();
        backend_returned_code2.exists();
    }
}
