package Trefilova;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class Tests {

    @Test
    public void TestPet1() {
        Steps step = new Steps();

        step.createPetTest();
        step.requestTestId200();
        step.deletePetTest();
        step.requestTestId404();
    }
}
