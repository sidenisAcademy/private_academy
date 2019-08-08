package steps;

import com.codeborne.selenide.SelenideElement;
import com.thoughtworks.gauge.Step;
import timemaster.headerToolbarElement.HeaderToolbarElement;
import timemaster.vacationsPage.VacationsPage;

public class VacationsSteps {

    VacationsPage vacationsPage = new VacationsPage();
    HeaderToolbarElement headerToolbarElement = new HeaderToolbarElement();

    @Step("Click Vacations button")
    public void clickVacationsButton() {
        headerToolbarElement.clickVacations();
    }

    @Step("Click create vacation button")
    public void clickCreateVacationButton() {
        try {
            vacationsPage.click_createVacation();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setDateFrom(String dateFrom) {
        vacationsPage.set_date_from(dateFrom);
    }

    public void setDateTo(String dateTo) {
        vacationsPage.set_date_to(dateTo);
    }

    @Step("Set vacation dates <dateFrom> <dateTo>")
    public void setVacationsDates(String dateFrom, String dateTo) {
        setDateFrom(dateFrom);
        setDateTo(dateTo);
    }

    public void clearVacationDateFrom() {
        vacationsPage.clear_date_from();
    }

    public void clearVacationDateTo() {
        vacationsPage.clear_date_to();
    }

    @Step("Change vacation Day From <dateFrom>")
    public void changeVacationDateFrom(String dateFrom) {
        clearVacationDateFrom();
        //setDateFrom(dateFrom);
    }

    @Step("Change vacation Day To <dateTo>")
    public void changeVacationDateTo(String dateTo) {
        clearVacationDateTo();
        setDateTo(dateTo);
    }

    public void setUnpaidLeave() {
        vacationsPage.set_unpaid_leave();
    }

    @Step("Click close vacation form")
    public void clickCloseVacationForm() {

        vacationsPage.click_close_button();
    }

    @Step("Click Create in form")
    public void clickCreateVacationInForm() {
        vacationsPage.click_create_button();
    }

    @Step("Check backend errors and close them")
    public void checkBackendErrorsAppearAndCloseThem() {
        vacationsPage.check_backend_errors();
        vacationsPage.close_backend_errors();
    }

    @Step("Open created vacation")
    public void open_created_vacation() {
        vacationsPage.click_on_created_vacation();
    }

//    public void createVacationWithoutUnpaidLeave(String dateFrom, String dateTo) {
//        clickCreateVacationButton();
//        setVacationsDates(dateFrom, dateTo);
//        clickCreateVacationInForm();
//    }

    public void countVacationDays() {

    }
}
