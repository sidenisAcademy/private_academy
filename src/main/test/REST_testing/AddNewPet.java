package REST_testing;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j

public class AddNewPet {
    private void login(){ String resp = given()
            .contentType(ContentType.JSON)
            .when()
            .body("{  \"email\": \"string22\", \"password\": \"string22\"}")
            .post("http://172.16.12.25:5555/login")
            .then()
            .extract()
            .asString();

        log.info("http://172.16.12.25:5555/register" + resp);
    }

}

//{
//        "id": 0,
//        "category": {
//        "id": 0,
//        "name": "string"
//        },
//        "name": "doggie",
//        "photoUrls": [
//        "string"
//        ],
//        "tags": [
//        {
//        "id": 0,
//        "name": "string"
//        }
//        ],
//        "status": "available"
//        }
