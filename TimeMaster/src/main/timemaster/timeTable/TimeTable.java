package timemaster.timeTable;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.thoughtworks.gauge.Step;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Slf4j
public class TimeTable {

    ElementsCollection dayIcon;
    ElementsCollection dayValue;
    ElementsCollection workHours;
    ElementsCollection breaks;
    ElementsCollection dayType;

    public TimeTable() {
        dayIcon = $$("div[class = 'day-title'] > i");
        dayValue = $$("span[class = 'day-title__day-value']");
        workHours = $$("td[data-test = 'work-hours']");
        breaks = $$("td[data-test = 'break']");
        dayType = $$("td[htNoWrap htAutocomplete current highlight = 'htAutocompleteArrow']");
    }
    public void setText(String newBreak) {
        SelenideElement breakChanger;
        breakChanger = $("textarea[class = 'handsontableInput']").shouldBe(Condition.visible);
        breakChanger.doubleClick();
        breakChanger.sendKeys(newBreak);
    }
    public void setBreak(String newBreak) {
        log.info("Set break: " + newBreak);
        breaks.get(0).doubleClick();
        setText(newBreak);
    }
}
