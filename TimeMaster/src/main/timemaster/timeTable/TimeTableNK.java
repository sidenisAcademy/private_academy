package timemaster.timeTable;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Slf4j
public class TimeTableNK {

    SelenideElement timeTable;
    ElementsCollection timeTableRows,
            dayIcons,
            dayValue,
            workHours,
            breaks,
            dayTypeArrows;

    public TimeTableNK() {
        timeTable = $(byXpath("//div[@class='ht_master handsontable']//table[@class='htCore time-tracker']//tbody"));
        timeTableRows = timeTable.$$("tr");
        dayIcons = $$("div[class = 'day-title'] > i");
        dayValue = $$("span[class = 'day-title__day-value']").shouldBe(CollectionCondition.sizeNotEqual(0));
        workHours = $$("td[data-test = 'work-hours']").shouldBe(CollectionCondition.sizeNotEqual(0));
        breaks = $$("td[data-test = 'break']").shouldBe(CollectionCondition.sizeNotEqual(0));
        dayTypeArrows = $$("div[class = 'htAutocompleteArrow']").shouldBe(CollectionCondition.sizeNotEqual(0));
    }

    public SelenideElement selectAndClearBreakText() {
        SelenideElement breakTextarea;
        breakTextarea = $("textarea[class = 'handsontableInput']").shouldBe(Condition.visible);
        breakTextarea.click();
        breakTextarea.clear();
        return breakTextarea;
    }

    public void clearTimeTable() {
        log.info("Clear cells in TimeTable");
        for (SelenideElement row : timeTableRows) {
            row.$("td[data-test = 'break']").doubleClick();
            selectAndClearBreakText();
            row.$("div[class = 'htAutocompleteArrow']").click();
            $(byXpath("//*[@id='hot']/div[@class='handsontableInputHolder']/div/div[1]/div/div/div/table/tbody/tr[1]/td"))
                    .click();
        }
    }

    public void checkDaysInCurrentMonth() {
        Calendar c = Calendar.getInstance();
        int monthMaxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        timeTableRows.shouldHave(size(monthMaxDays));
    }

    public SelenideElement getDayIcon() {
        SelenideElement deyIcon;
        deyIcon = $("div[class = 'day-title'] > i").shouldBe(Condition.visible);
        return deyIcon;
    }

    public void setBreak(String newBreak, Integer rowNumber) {
        log.info("Set break: " + newBreak);
        breaks.get(rowNumber).doubleClick();
        selectAndClearBreakText().sendKeys(newBreak);
    }

    public void deleteBreak(Integer rowNumber) {
        log.info("Delete break");
        breaks.get(rowNumber).doubleClick();
        selectAndClearBreakText();
    }

    public void setDayTypeByText(String dayType, Integer rowNumber) {
        log.info("Set day type: " + dayType);
        dayTypeArrows.get(rowNumber).click();
        $(byText(dayType)).click();
    }

}
