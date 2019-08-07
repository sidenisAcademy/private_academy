package timemaster.timeTable;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

@Slf4j
public class TimeTable {

    ElementsCollection dayIcon;
    ElementsCollection dayValue;
    ElementsCollection workHours;
    ElementsCollection breaks;
    ElementsCollection dayType;
    ElementsCollection is;
    ElementsCollection isGuild;

    public TimeTable() {
        dayIcon = $$("div[class = 'day-title'] > i");
        dayValue = $$("span[class = 'day-title__day-value']");
        workHours = $$("td[data-test = 'work-hours']");
        breaks = $$("td[data-test = 'break']");
        dayType = $$("td[htNoWrap htAutocomplete current highlight = 'htAutocompleteArrow']");
        is = $$(By.xpath("//tr[@class=\"day-type--BD\"][4]/td[@class=\"\"][3]"));
        isGuild=$$(By.xpath("//tr[@class=\"day-type--BD\"][4]/td[@class=\"\"][5]"));
    }
    public void setText(String newBreak) {
        SelenideElement breakChanger;
        breakChanger = $("textarea[class = 'handsontableInput']").shouldBe(Condition.visible);
        breakChanger.doubleClick();
        breakChanger.sendKeys(newBreak);
    }
    public void setBreak(String newBreak) {
        log.info("Set break: " + newBreak);
        breaks.get(4).doubleClick();
        setText(newBreak);
        breaks.get(5).click();
        sleep(6000);
    }

    public void setIs(String newIs){
        log.info("Set is time: "+newIs);
        is.get(0).doubleClick();
        setIsTime(newIs);
        is.get(0).click();
        sleep(6000);
    }

    public void setIsTime(String newIs) {
        SelenideElement iSTime;
        iSTime = $(By.xpath("//textarea[@class=\"handsontableInput\"]"));
        iSTime.doubleClick();
        iSTime.sendKeys(newIs);
    }

    public void setIsGuild(String newIsGuild){
        log.info("Set is time: "+newIsGuild);
        isGuild.get(0).doubleClick();
        setIsGuildTime(newIsGuild);
        isGuild.get(0).click();
        sleep(6000);
    }

    public void setIsGuildTime(String newIsGuild) {
        SelenideElement iSGuildTime;
        iSGuildTime = $(By.xpath("//textarea[@class=\"handsontableInput\"]"));
        iSGuildTime.doubleClick();
        iSGuildTime.sendKeys(newIsGuild);
    }
}