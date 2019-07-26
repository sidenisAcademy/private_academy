package CherkashinTests.RestAssured.HappyThreePets;

import org.junit.Test;

public class TestSteps {
    @Test
    public void addingByFirstMethod() {
        Steps firstTest = new Steps();
        firstTest.methodTheCreatorOne();
    }

    @Test
    public void addingBySecondMethod() {
        Steps secondTest = new Steps();
        secondTest.methodTheCreatorTwo();
    }

    @Test
    public void addingByThirdMethod() {
        Steps thirdTest = new Steps();
        thirdTest.methodTheCreatorThree();
    }

    @Test
    public void changingPet() {
        Steps fourthTest = new Steps();
        fourthTest.changePetParams();
        fourthTest.equalChangedPet(3);
    }
}
