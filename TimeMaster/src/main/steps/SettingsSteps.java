package steps;

import timemaster.settingsPage.SettingsPage;

public class SettingsSteps {
    SettingsPage sp = new SettingsPage();

    public void initializePage() {sp.loadSettingsTab();}
    public void setPreviousBreakValue() {sp.setPreviousBreak();}
    public void setUserBreakValue() {sp.setBreakValue("0:30");}
    public void selectTimeZone() {sp.selectTimeZone("Krasnoyarsk");}
    public void setProjectList() {sp.selectProject("Sidenis");}
    public boolean isBreakInputEnabled() {
        return sp.getBreak_input().isEnabled();
    }
    public String getBreakValue(){
        return sp.getBreak_input().getValue();
    }

}
