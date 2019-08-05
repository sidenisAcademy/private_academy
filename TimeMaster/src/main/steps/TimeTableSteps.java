package steps;

import timemaster.timeTable.TimeTable;

public class TimeTableSteps {

    TimeTable page = new TimeTable();

    public void setBreak(String newBreak) {
        page.setBreak(newBreak);
    }

}
