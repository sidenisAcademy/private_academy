package Trefilova;

import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class FetchPractice {
    public static void main(String[] args) {

        String response = given()
                .relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .cookie("csrftokenn", "TX8Tzc9D7kXvzJOK8qbhXyGWwNQLSw5mGo1WXclX2oZYNp8fNielb7PjvqEUMApp")
                .cookie("sessionid", "2bm52x39rccrvzbyf9lj2cmiwieqhvuo")
                .when()
                .get("https://timemaster-dev2.sidenis.local/api/whoami/")
                .then()
                .extract()
                .asString();

        System.out.println(response);
    }
}
