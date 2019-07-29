import Polozov.Pet;
import Polozov.SmokeTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.assertTrue;

public class TestPetV2 {

    @Test
    public void testPet() {
    }

    @Test
    @Category(SmokeTests.class)
    public void testMeaow() {
        Pet testPet = new Pet();
        assertTrue("Meaow".equals(testPet.meaow()));
    }

}
