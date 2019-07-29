import Polozov.All;
import Polozov.Pet;
import Polozov.SmokeTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PetTest {

    @Test
    @Category(All.class)
    public void testPet2() {
    }

    @Test
    @Category(SmokeTests.class)
    public void testMeaow2() {
        Pet testPet = new Pet();
        assertEquals("Meaow",testPet.meaow());
    }

}
