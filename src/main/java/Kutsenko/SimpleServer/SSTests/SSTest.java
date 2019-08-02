package Kutsenko.SimpleServer.SSTests;

import Kutsenko.SimpleServer.SSSteps.SSSteps;
import org.junit.Test;

public class SSTest {
    @Test
    public void requestTest() {

//        SSSteps.stepRegisterSimpleServer("me1", "456");
        String token = SSSteps.stepAuthSimpleServer("me1", "456");
        SSSteps.stepGetProtected(token);

    }
}
