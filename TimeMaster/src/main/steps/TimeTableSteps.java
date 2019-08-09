package steps;

import com.thoughtworks.gauge.Step;
import timemaster.timeTable.TimeTable;

public class TimeTableSteps1 {

    TimeTable page = new TimeTable();

    @Step("set a new break <newBreak>")
    public void setBreak(String newBreak) {
        page.setBreak(newBreak);
    }

    @Step("set a new time for is <newIs>")
    public void setIsTime(String newIs){
        page.setIs(newIs);
    }

    @Step("set a new time for isGuild <newIsGuild>")
    public void setIsGuildTime(String newIsGuild){
        page.setIsGuild(newIsGuild);
    }
}