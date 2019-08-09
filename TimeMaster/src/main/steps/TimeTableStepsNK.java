package steps;

import com.codeborne.selenide.SelenideElement;
import com.thoughtworks.gauge.Step;
import timemaster.timeTable.TimeTableNK;

public class TimeTableStepsNK {

    TimeTableNK page = new TimeTableNK();

    @Step("Check that day icon exist")
    public void checkThatDayIconExist() {
        SelenideElement elm = page.getDayIcon();
        elm.exists();
    }

    @Step("Set a new break <newBreak>")
    public void setBreak(String newBreak) {
        page.setBreak(newBreak);
    }

    @Step("Delete break")
    public void deleteBreak() {
        page.deleteBreak();
    }

    @Step("Select day type <dayType>")
    public void setDayType(String dayType) {
        page.setDayTypeByText(dayType);
    }

}
