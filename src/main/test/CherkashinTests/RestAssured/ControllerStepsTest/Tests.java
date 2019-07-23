package CherkashinTests.RestAssured.ControllerStepsTest;

import org.junit.Test;

public class Tests extends Controller {
    @Test
    public void requesttest() {
        Integer id = PostPet();
        GetPet(id);
        DelPet(id);
        GetDeletedPet(id);
    }
}
