package steps;

import com.codeborne.selenide.Selenide;
import timemaster.settingsPage.SettingsPage;

public class SettingsSteps {
    SettingsPage sp = new SettingsPage();

    public void initializePage() {sp.loadSettingsTab();}
    public void setPreviousBreakValue() {sp.setPreviousBreak();}
    public void setUserBreakValue() {sp.setBreakValue("0:60");}
    public void selectTimeZone() {sp.selectTimeZone("Krasnoyarsk");}
    public void setProjectList() {sp.selectProject("Sidenis");}
    public boolean isBreakInputEnabled() {
        Selenide.sleep(10000);
        return sp.getBreak_input().isEnabled();
    }  // isEnabled - свойство, которое может вернуть значение true или false, в нашем случае для GetBreak
    public String getBreakValue(){
        return sp.getBreak_input().getValue();
    }

}
