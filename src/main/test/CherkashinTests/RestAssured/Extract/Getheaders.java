package CherkashinTests.RestAssured.Extract;

import CherkashinTests.RestAssured.PetDto;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.head;

@Slf4j
public class Getheaders {
    private void GetPet() {
        int id = 1;
        List<Header> getheaders = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .extract()
                .headers()
                .asList();
        log.info("headers: " + getheaders);
    }

    @Test
    public void requestheader() {
        head();
    }
}
