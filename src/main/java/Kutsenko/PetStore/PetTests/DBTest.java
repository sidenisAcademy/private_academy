package Kutsenko.PetStore.PetTests;

import Kutsenko.PetStore.PetSteps.DBSteps;
import org.junit.Before;
import org.junit.Test;

public class DBTest {

    private String name1;
    private String name2;
    private String name3;

    @Before
    public void setUp() {
        name1 = DBSteps.stepGenerateRandomString();
        name2 = DBSteps.stepGenerateRandomString();
        name3 = DBSteps.stepGenerateRandomString();
    }

    @Test
    public void editPetTest() {
        DBSteps.stepAddPet(name1, "cat", "F", true);
        DBSteps.stepAddPet(name2, "cat", "F", true);
        DBSteps.stepSelectPet(name1);
        DBSteps.stepSelectPet(name2);
        DBSteps.stepChangePetName(name1, name3);
        DBSteps.stepDeletePet(name3);
        DBSteps.stepDeletePet(name2);
    }

}
