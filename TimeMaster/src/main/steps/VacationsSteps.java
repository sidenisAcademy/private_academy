package steps;

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
        vacationsPage.click_createVacation();
    }

    @Step("Set vacation dates")
    public void setVacationsDates(String dateFrom, String dateTo) {
        vacationsPage.set_date_from(dateFrom);
        vacationsPage.set_date_to(dateTo);
    }

    @Step("Click create vacation")
    public void setUnpaidLeave() {
        vacationsPage.set_unpaid_leave();
    }

    public void clickCloseVacationForm() {
        vacationsPage.click_close_button();
    }

    public void clickCreateVacationInForm() {
        vacationsPage.click_create_button();
    }

    public void createVacationWithoutUnpaidLeave(String dateFrom, String dateTo) {
        clickCreateVacationButton();
        setVacationsDates(dateFrom, dateTo);
        clickCreateVacationInForm();
    }
}
