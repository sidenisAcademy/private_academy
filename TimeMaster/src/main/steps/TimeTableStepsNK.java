package steps;

import com.codeborne.selenide.SelenideElement;
import com.thoughtworks.gauge.Step;
import timemaster.timeTable.TimeTableNK;

public class TimeTableStepsNK {

    TimeTableNK page = new TimeTableNK();

    @Step("Clear cells in the TimeTable")
    public void clearTimeTable() {
        page.clearTimeTable();
    }

    @Step("Check that the number of rows in the TimeTable corresponds to the number of days in the current month")
    public void checkRowsCorrespondsToDaysInCurrentMonth() {
        page.checkDaysInCurrentMonth();
    }

    @Step("Check that there is an exclamation mark at the beginning of at least one row")
    public void checkThatDayIconExist() {
        SelenideElement elm = page.getDayIcon();
        elm.exists();
    }

    @Step("Set a new break <newBreak> on row number <rowNumber>")
    public void setBreak(String newBreak, Integer rowNumber) {
        page.setBreak(newBreak, rowNumber);
    }

    @Step("Delete break on row number <rowNumber>")
    public void deleteBreak(Integer rowNumber) {
        page.deleteBreak(rowNumber);
    }

    @Step("Select day type <dayType> on row number <rowNumber>")
    public void setDayType(String dayType, Integer rowNumber) {
        page.setDayTypeByText(dayType, rowNumber);
    }

}
