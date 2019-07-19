package Isabekov.While;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Loop_origianal_tests {

@Before
public void setUp() {
}

@After
public void tearDown()  {
}



    @Test
    public void AutoTest() {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";

        int totalElements = friends.length;
        int i = 0;

        while (i<totalElements){
            if (friends[i] == null) {
                i++;
                continue;
            }

            System.out.println("I love " + friends[i]);

            if (friends[i] == "Rosa") {
                break;
            }
            i++;
        }

        System.out.println("The iteration is over");
    }
}
