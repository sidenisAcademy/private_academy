package steps;

import com.codeborne.selenide.Selenide;
import com.thoughtworks.gauge.Step;
import timemaster.timeTable.TimeTable;

public class TimeTableSteps {

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

    @Step("set a new comment <newComment>")
    public void setNewComment(String newComment){
        page.setComments(newComment);
    }

    @Step("pause")
    public void pause(){
        Selenide.sleep(5000);
    }
}