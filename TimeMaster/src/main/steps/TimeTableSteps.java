package steps;

import com.thoughtworks.gauge.Step;
import timemaster.timeTable.TimeTable;

public class TimeTableSteps {

    TimeTable page = new TimeTable();

    @Step("set a new break <newBreak>")
    public void setBreak(String newBreak) {
        page.setBreak(newBreak);
    }

}
