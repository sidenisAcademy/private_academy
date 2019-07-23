package Polozov;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PetTest {

    @Test
    public void testPet() {
    }

    @Test
    public void testMeaow() {
        Pet testPet = new Pet();
        assertTrue("Meaow".equals(testPet.meaow()));
    }

}
