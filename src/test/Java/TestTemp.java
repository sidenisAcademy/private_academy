import Mityagina.All;
import Mityagina.SmokeTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestTemp {

    @Test
    @Category(All.class)
    public void testA() {
        System.out.println("TestA");
    }

    @Test
    @Category(All.class)
    public void testB() {
        System.out.println("TestB");
    }

    @Test
    @Category(SmokeTests.class)
    public void testC() {
        System.out.println("TestC");
    }
}
