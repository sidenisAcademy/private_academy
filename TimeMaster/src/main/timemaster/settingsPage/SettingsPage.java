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
    SelenideElement timezone;
    SelenideElement project;
    SelenideElement sidenisLogo;
    ElementsCollection checkbox_list;


    public void loadSettingsTab() {
        settingsTab = $(
                "body > tm-root > tm-header > tm-menu > mat-toolbar > mat-toolbar-row > nav > a:nth-child(2) > span");
        settingsTab.click();
        waitElement();
        InitPage();

    }

    public void waitElement() {
        //wait until project list aapears
        $("#formly_4_select_value_0 > div").waitUntil(Condition.enabled, 30000);
    }

    public void InitPage() {
        // waitElement();
        rememberBreak_button = $(
                "#formly_3_radio_isDefaultBreakDuration_0_0 > label > div.mat-radio-container > div.mat-radio-ripple.mat-ripple");
        setBreak_button = $(
                "#formly_3_radio_isDefaultBreakDuration_0_1 > label > div.mat-radio-container > div.mat-radio-inner-circle");
        break_input = $("#formly_3_input_breakDuration_1");
        timezone = $("#formly_4_select_value_0 > div > div.mat-select-arrow-wrapper");
        project = $("#formly_5_select_projects_0 > div > div.mat-select-arrow-wrapper");
        checkbox_list = $$("span.mat-option-text");
        sidenisLogo = $("tm-header > tm-menu > mat-toolbar > mat-toolbar-row > div > div.logo");

    }

    public SelenideElement getBreak_input() {
        waitElement();
        return break_input;
    }

    public void setPreviousBreak() {
        waitElement();
        rememberBreak_button.submit();
        rememberBreak_button.waitUntil(Condition.enabled, 10000);

    }

    public void setBreakValue(String value) {
        waitElement();
        setBreak_button.submit();
        break_input.click();
        break_input.clear();
        break_input.setValue(value);
        break_input.submit();
    }

    public void openDropDownList(SelenideElement element) {
        waitElement();
        element.doubleClick();
    }

    public void selectTimeZone(String city) {
        openDropDownList(timezone);
        checkbox_list.stream().filter(element -> element.getText().contains(city)).findFirst().get().parent().click();
    }

    public void selectProject(String projectName) {
        openDropDownList(project);
        waitElement();
        //checkbox_list.stream().filter(element -> element.getText().contains(projectName)).forEach(e -> e.parent().click());
        checkbox_list.stream().filter(element -> element.getText().contains(projectName)).forEach(e -> (e.parent()).click());
        setBreak_button.submit();

    }

    public boolean checkIfCitySet(String cityName) {
        return isOptionSet(cityName, timezone);
    }

    public boolean checkIfProjectSet(String projectName) {
        return isOptionSet(projectName, project);
    }

    public boolean isOptionSet(String option, SelenideElement el) {
        openDropDownList(el);
        boolean isSet;
        SelenideElement optionToSet = checkbox_list.stream().filter(element -> element.getText().contains(option)).findFirst().get();
        isSet = Boolean.valueOf((optionToSet.parent()).getAttribute("aria-selected"));
        optionToSet.click();
        return isSet;

    }


}
