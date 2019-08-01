package REST_testing.Kutsenko.SimpleServer.SSTests;

import REST_testing.Kutsenko.SimpleServer.SSSteps.SSSteps;
import org.junit.Test;

public class SSTest {
    @Test
    static void requestTest() {

//        SSSteps.stepRegisterSimpleServer("me1", "456");
        String token = SSSteps.stepAuthSimpleServer("me1", "456");
        SSSteps.stepGetProtected(token);

    }
}
