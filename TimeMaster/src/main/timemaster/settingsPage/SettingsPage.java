package timemaster.settingsPage;

import com.codeborne.selenide.*;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
@Slf4j
public class SettingsPage {

    SelenideElement settingsTab;
    SelenideElement rememberBreak_button;
    SelenideElement setBreak_button;
    SelenideElement break_input;
    SelenideElement country_errow;
    SelenideElement project_errow;
    ElementsCollection checkbox_list;
    ElementsCollection projects;
    SelenideElement actualCity;



    public void loadSettingsTab() {
        settingsTab = $(
                "body > tm-root > tm-header > tm-menu > mat-toolbar > mat-toolbar-row > nav > a:nth-child(2) > span");
        settingsTab.click();
        InitPage();

    }

    public void waitElement() {
        //wait until break_input
        $("#formly_3_input_breakDuration_1").waitUntil(Condition.visible, 20000);
    }

    public void InitPage() {
        waitElement();
        rememberBreak_button = $("#formly_3_radio_isDefaultBreakDuration_0_0 > label > div.mat-radio-container > div.mat-radio-ripple.mat-ripple");
        setBreak_button = $("#formly_3_radio_isDefaultBreakDuration_0_1 > label > div.mat-radio-container > div.mat-radio-inner-circle");
        break_input = $("#formly_3_input_breakDuration_1");
        country_errow = $("#formly_4_select_value_0 > div > div.mat-select-arrow-wrapper");
        project_errow = $("#formly_5_select_projects_0 > div > div.mat-select-arrow-wrapper");
        checkbox_list = $$("span.mat-option-text");
        actualCity = $("tm-time-zone-selector > form > formly-form > formly-field");
        //checkbox_list = $$("span.mat");
        //projects = $$("#formly_4_select_value_0 > div > div.mat-select-arrow-wrapper > div");

    }

    public SelenideElement getBreak_input() {
        waitElement();
        return break_input;
    }

    public SelenideElement getActualCity() {
        actualCity.waitUntil(Condition.visible, 10000);
        return actualCity;
    }

    public void setPreviousBreak() {
        rememberBreak_button.submit();
        //rememberBreak_button.waitUntil(Condition.checked, 1000);
    }


    public void setBreakValue(String value) {
        setBreak_button.submit();
        break_input.click();
        break_input.clear();
        break_input.setValue(value);
        break_input.submit();
    }

    public void selectTimeZone(String city) {
        waitElement();
        country_errow = $("#formly_4_select_value_0 > div > div.mat-select-arrow-wrapper");
        country_errow.doubleClick();
        SelenideElement cityToSet = checkbox_list.stream().filter(element -> element.getText().contains(city)).findFirst().get();
        cityToSet.parent().click();
    }

    public void selectProject(String project) {
        projects.stream().filter(element -> element.getText().contains(project)).forEach(e -> e.parent().click());
    }

    public boolean isCityTicked(String city)
    {
        waitElement();
        country_errow = $("#formly_4_select_value_0 > div > div.mat-select-arrow-wrapper > div");
        country_errow.doubleClick();
        SelenideElement cityToSet = checkbox_list.stream().filter(element -> element.getText().contains(city)).findFirst().get();
        return Boolean.valueOf(cityToSet.parent().getAttribute("aria-selected"));
    }


}
