package Timemaster;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static Trefilova.JDBC.PropertiesList.*;
import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class FetchPractice {
    public static void main(String[] args) {

        String response = given()
                .relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .cookie(tokenName, tokenName)
                .cookie(sessionName, sessionValue)
                .when()
                .get(tmUrl)
                .then()
                .extract()
                .asString();

        System.out.println(response);
    }
}
