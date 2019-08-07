package timemaster.timeTable;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Slf4j
public class TimeTableNK {

    SelenideElement timeTable;
    ElementsCollection daysTypeBD;
    ElementsCollection daysTypeWE;
    ElementsCollection dayIcons;
    ElementsCollection dayValue;
    ElementsCollection workHours;
    ElementsCollection breaks;
    ElementsCollection dayTypeArrows;

    public TimeTableNK() {
        timeTable = $(byXpath("//div[@class='ht_master handsontable']//table[@class='htCore time-tracker']"));
        daysTypeBD = timeTable.$$("tr[class = 'day-type--BD']");
        daysTypeWE = timeTable.$$("tr[class = 'day-type--WE']");
        timeTable = $(byXpath("//div[@class='ht_master handsontable']//table[@class='htCore time-tracker']"));
        dayIcons = $$("div[class = 'day-title'] > i");
        dayValue = $$("span[class = 'day-title__day-value']").shouldBe(CollectionCondition.sizeNotEqual(0));
        workHours = $$("td[data-test = 'work-hours']").shouldBe(CollectionCondition.sizeNotEqual(0));
        breaks = $$("td[data-test = 'break']").shouldBe(CollectionCondition.sizeNotEqual(0));
        dayTypeArrows = $$("div[class = 'htAutocompleteArrow']").shouldBe(CollectionCondition.sizeNotEqual(0));
    }

    public SelenideElement getDayIcon() {
        SelenideElement deyIcon;
        deyIcon = $("div[class = 'day-title'] > i").shouldBe(Condition.visible);
        return deyIcon;
    }


    public SelenideElement selectAndClearBreakText() {
        SelenideElement breakTextarea;
        breakTextarea = $("textarea[class = 'handsontableInput']").shouldBe(Condition.visible);
        breakTextarea.click();
        breakTextarea.clear();
        return breakTextarea;
    }

    public void setBreak(String newBreak) {
        log.info("Set break: " + newBreak);
        breaks.get(0).doubleClick();
        selectAndClearBreakText().sendKeys(newBreak);
    }

    public void deleteBreak() {
        log.info("Delete break");
        breaks.get(0).doubleClick();
        selectAndClearBreakText();
    }

    public void setDayTypeByText(String dayType) {
        log.info("Set day type: " + dayType);
        dayTypeArrows.get(0).click();
        $(byText(dayType)).click();
    }

}
