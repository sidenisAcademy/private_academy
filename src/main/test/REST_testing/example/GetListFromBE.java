package REST_testing.example;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class GetListFromBE {

    private void request() {
        PetDto[] resp = given()
                .queryParam("status", "available")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto[].class);

        List<PetDto> pets = Arrays.asList(resp);
        pets.forEach(pet -> log.info(pet.toString()));
    }

    @Test
    public void test(){
        request();
    }

}
