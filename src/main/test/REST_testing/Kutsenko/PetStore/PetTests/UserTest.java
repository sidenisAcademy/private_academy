package REST_testing.Kutsenko.PetStore.PetTests;

import REST_testing.Kutsenko.PetStore.PetSteps.UserSteps;
import org.junit.Test;

public class UserTest {

    @Test
    public void loginTest() {

        UserSteps.stepUserLogin("me", "123");
        UserSteps.stepUserLoginWithAuthBasic("me1", "456");

    }

}
