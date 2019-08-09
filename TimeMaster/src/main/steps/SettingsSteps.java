package steps;

import com.codeborne.selenide.Selenide;
import com.thoughtworks.gauge.Step;
import timemaster.settingsPage.SettingsPage;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SettingsSteps {
    SettingsPage sp = new SettingsPage();

    @Step("Init page")
    public void initializePage() {sp.loadSettingsTab();}
    @Step("Validation settings")
    public void SettingValidation(){assertThat(url()).isEqualTo("https://timemaster-dev2.sidenis.local/settings");}
    @Step("Break Previous")
    public void setPreviousBreakValue() {sp.setPreviousBreak();}

    public void setUserBreakValue() {sp.setBreakValue("0:60");}

    public void selectTimeZone() {sp.selectTimeZone("Kuwait");}
//    public void TimeZoneValidation(){assertThat();}
    public void setProjectList() {sp.selectProject("Risk");}
    public boolean isBreakInputEnabled() {
        Selenide.sleep(10000);
        return sp.getBreak_input().isEnabled();
    }  // isEnabled - свойство, которое может вернуть значение true или false, в нашем случае для GetBreak
    public String getBreakValue(){
        return sp.getBreak_input().getValue();
    }

}
