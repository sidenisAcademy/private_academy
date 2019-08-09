package timemaster.settingsPage;

import com.codeborne.selenide.*;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Slf4j              // нужен для возможности логироваться
public class SettingsPage {

    SelenideElement settingsTab;
    SelenideElement rememberBreak_button;
    SelenideElement setBreak_button;
    SelenideElement break_input;
//    SelenideElement arrow_countries;
    SelenideElement field_countries;
    ElementsCollection countries;
    ElementsCollection projects;

    public SelenideElement getBreak_input() {       // проверяем что элемент доступен
        return break_input;
    }

    public void SettingsPage() {
    }

    public void loadSettingsTab() {
        settingsTab = $("body > tm-root > tm-header > tm-menu > mat-toolbar > mat-toolbar-row > nav > a:nth-child(2) > span");
        settingsTab.click();
        InitPage();                     // вызываем выполненение метода Init page

    }

    public void waitElement() {
        $("#formly_3_input_breakDuration_1").waitUntil(Condition.visible, 10000);
    }

    public void InitPage() {
        waitElement();
        rememberBreak_button = $("#formly_3_radio_isDefaultBreakDuration_0_0 > label > div.mat-radio-label-content");
        setBreak_button = $("#formly_3_radio_isDefaultBreakDuration_0_1 > label > div.mat-radio-container > div.mat-radio-inner-circle");
        break_input = $("#formly_3_input_breakDuration_1");
//       arrow_countries = $("#formly_4_select_value_0 > div > div.mat-select-arrow-wrapper");   //.get(0) -вызывает первый элемент из найденного списка если обращаемся как к коллекции элементов и  поставим $$
        field_countries = $("#formly_4_select_value_0 > div > div.mat-select-value");
        countries = $$(".mat-option-text");     //селектор для всего списка стран
        projects = $$("#formly_5_select_projects_0 > div > div.mat-select-arrow-wrapper");

// Не могу найти ни один из перечисленных селекторов
    }

    public void setPreviousBreak() {
        rememberBreak_button.submit();
    }


    public void setBreakValue(String value) {
        setBreak_button.submit();
        break_input.waitUntil(Condition.enabled, 10000);
        break_input.click();
        break_input.clear();
        break_input.setValue(value);
        break_input.submit();
    }

    public void selectTimeZone(String city) {
        log.info("waiting for arrow");
        field_countries.waitUntil(Condition.enabled, 20000);
        log.info("arrow is enabled");
  //     arrow_countries.doubleClick(); // можно поставить doubleClick(
        field_countries.doubleClick(); // вызываем поле
        log.info("click on arrow");
//сначала вызываем локатор для всех элементов коллекции а потом уже фильтруем
//        country_collection
        countries.stream().filter(element -> element.getText().contains(city)).findFirst().get().click();
    }

    public void selectProject(String project) {

        break_input.waitUntil(Condition.enabled, 10000);
        projects.stream().filter(element -> element.getText().contains(project)).forEach(e -> e.click());
    }


}
