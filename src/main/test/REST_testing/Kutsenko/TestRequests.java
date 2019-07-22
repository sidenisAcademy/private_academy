package REST_testing.Kutsenko;

import org.junit.Test;

public class TestRequests {

    @Test
    public void requestTest() {

        Integer newId = PetSteps.stepOne(604);
        PetSteps.stepTwo(newId);
        PetSteps.stepThree(newId);
        PetSteps.stepFour(newId);

    }
}
