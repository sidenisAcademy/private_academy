package steps;

import timemaster.vacationsPage.VacationsPage;

public class VacationsSteps {

    VacationsPage vacationsPage = new VacationsPage();

    public void clickCreateVacationButton() {
        vacationsPage.click_createVacation();
    }

    public void setVacationsDates(String dateFrom, String dateTo) {
        vacationsPage.set_date_from(dateFrom);
        vacationsPage.set_date_to(dateTo);
    }

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
