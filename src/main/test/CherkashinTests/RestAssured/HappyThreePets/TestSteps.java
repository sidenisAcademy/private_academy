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
}
