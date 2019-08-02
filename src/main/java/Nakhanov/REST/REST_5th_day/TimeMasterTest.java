package Nakhanov.REST.REST_5th_day;

import org.junit.Test;

public class TimeMasterTest {
    private TimeMasterSteps timeMasterSteps = new TimeMasterSteps();
    @Test
    public void whoAmITest(){
        timeMasterSteps.whoAmITimeMasterStep();
    }

    @Test
    public void getAllInfoForCurrentUserTest(){
        timeMasterSteps.getInfoForCurrentUserStep();
    }

    @Test
    public void putCommentTest(){
        timeMasterSteps.putCommentStep();
    }
}
