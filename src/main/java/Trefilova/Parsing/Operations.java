package Trefilova.Parsing;


import static org.junit.Assert.*;


public class Operations {

    public void compareIds(WordPress[] wordPress) {
        for (WordPress item : wordPress) {
            int item1 = item.id;
            int item2 = Integer.parseInt(item.guid.rendered.split("=")[1]);
//            if(item1 == item2) {
//                System.out.println(item1 + " = " + item2);
//            }
//            else
//                System.out.println(item1 + " != " + item2);
            assertEquals(item1, item2);
        }
    }

    public void displayInfo(WordPress[] wordPresses) {
        for (WordPress item : wordPresses) {
//            if(item.status) {
//                System.out.println("Meta data:\n" + item.meta);
//            }
//            else
//                System.out.println("Tags data:\n" + item.tags);

            assertTrue("Hello test" + item.id, item.status);
        }
    }
}
