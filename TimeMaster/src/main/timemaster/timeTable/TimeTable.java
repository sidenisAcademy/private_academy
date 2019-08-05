package timemaster.timeTable;

import com.codeborne.selenide.ElementsCollection;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.*;

@Slf4j
public class TimeTable {

    ElementsCollection dayIcon;
    ElementsCollection dayValue;
    ElementsCollection workHours;
    ElementsCollection breaks;

    public TimeTable() {

        dayIcon = $$("div[class = 'day-title'] > i");
        dayValue = $$("span[class = 'day-title__day-value']");
        workHours = $$("td[data-test = 'work-hours']");
        breaks = $$("td[data-test = 'break']");

    }

    public void setBreak(String newBreak) {
        log.info("set break: " + newBreak);
        breaks.get(0).setValue(newBreak);
    }

}
