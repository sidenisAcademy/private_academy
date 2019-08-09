package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.thoughtworks.gauge.Step;
import timemaster.settingsPage.SettingsPage;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SettingsSteps {

    SettingsPage sp = new SettingsPage();
    String breakValue = "0:30";
    String projectSubName = "Sidenis";


    public String getBreakValue() {
        return sp.getBreak_input().getValue();
    }

    public String getTimeZoneValue() {
        return sp.getBreak_input().getValue();
    }

    @Step("Initialize page")
    public void initializePage() {sp.loadSettingsTab();}

    @Step("Remember Previous break")
    public void setPreviousBreakValue() {sp.setPreviousBreak();}


    @Step("Set user break value as <breakValue>")
    public void setUserBreakValue(String breakValue) {sp.setBreakValue(breakValue);}

    @Step("Select timezone for city <city>")
    public void selectTimeZone(String city) {sp.selectTimeZone(city);}

    @Step("Select project(s) with name <name>")
    public void setProjectName(String name) {sp.selectProject(name);}

    @Step("Check that user is on settings page")
    public void CheckSettingsPageURL() {
        assertThat(url()).isEqualTo("https://timemaster-dev2.sidenis.local/settings");
    }
    @Step("Check that break input field is disabled")
    public void isBreakInputEnabled() {
        //sp.wait();
        //Selenide.sleep(1000);
        assertThat(sp.getBreak_input().isEnabled()).isFalse();
    }

    @Step ("Check that break value is equal to <breakVal>")
    public void isBreakValueSet(String breakVal)
    {
        assertThat(sp.getBreak_input().getValue()).isEqualTo(breakVal);
    }


    @Step("Check that timezone for city <city> is set")
    public void isTimeZoneSet(String city)
    {
        assertThat(sp.checkIfCitySet(city)).isTrue();
    }


    @Step("Check that project with name <projectName> is set")
    public void isProjectSet(String projectName)
    {
        assertThat(sp.checkIfProjectSet(projectName)).isTrue();
    }


}
