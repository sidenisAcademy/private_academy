package timemaster.headerToolbarElement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


@Slf4j
public class HeaderToolbarElement {
    SelenideElement button_set_time;
    SelenideElement button_working_hours;
    SelenideElement button_end_time_switcher;

    SelenideElement button_timetable;
    SelenideElement button_settings;
    SelenideElement button_vacations;
    SelenideElement button_help;
    SelenideElement button_logout;

    public HeaderToolbarElement() {
        button_set_time = $(byClassName("timer-activation-btn ng-star-inserted"));
        button_working_hours = $(byClassName("working-hours"));
        button_end_time_switcher = $(byClassName("pointer ng-star-inserted"));

        button_timetable = $(byText("Timetable"));
        button_settings = $(byText("Settings"));
        button_vacations = $(byText("Vacations"));
        button_help = $(byText("Help"));
        button_logout = $(byText("Logout"));
    }

    public void clickTimeEndSwitcher() {
        log.info("click time end");
        button_end_time_switcher.click();
    }

    public void clickSetTime() {
        log.info("click set time");
        button_set_time.click();
    }

    public void clickTimetable() {
        log.info("click timetable");
        button_timetable.click();
    }

    public void clickSettings() {
        log.info("click settings");
        button_settings.click();
    }

    public void clickVacations() {
        button_vacations.waitUntil(Condition.visible, 10000);
        log.info("click vacations");
        button_vacations.click();
    }

    public void clickHelp() {
        log.info("click help");
        button_help.click();
    }

    public void clickLogout() {
        log.info("click logout");
        button_logout.click();
    }
}
