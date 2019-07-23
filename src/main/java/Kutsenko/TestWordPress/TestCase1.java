package Kutsenko.TestWordPress;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Kutsenko.TestWordPress.TestJSONParserWP.parseJSON;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCase1 {

    @Test
    public void testParseJSONTest() {
        String jsonPath = "resources/WordPress.json";
        //TestJSONParserWP parserWP = new TestJSONParserWP();
        List<WordPress> wordPressesList = parseJSON(jsonPath);
        Integer[] arrayActualId = null;
        List<Integer> arrayActually2 = new ArrayList<>();

        for (WordPress wordPresses : wordPressesList) {
            arrayActually2.add(wordPresses.id);
        }
        List<Integer> arrayExpectedId = new ArrayList<>(Arrays.asList(777999,777888));
        assertEquals(arrayActually2,arrayExpectedId);
    }

}
