package Nakhanov.REST.REST_2nd_Day;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;

public class Controllers {

    public static List<Header> headerRequestById(int id, int code) {
        List<Header> resp = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(code)
                .extract()
                .headers()
                .asList();
        return resp;
    }

    public static void registationOnDashaSwagger(){
        String authData = "{ \"email\": \"blabla1@email.email\", \"password\": \"SecurityPassword\" }";
        String str = given().urlEncodingEnabled(true)
                .header("Accept", "application/json")
                .contentType(ContentType.JSON)
                .body(authData)
                .post(   "http://172.16.12.25:5555/register")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        System.out.println(str);

    }

    public static String loginToDashaSwagger(){
        String authData = "{ \"email\": \"blabla1@email.email\", \"password\": \"SecurityPassword\" }";
        String token = given()
                .contentType(ContentType.JSON)
                .accept("application/json")
                .body(authData)
                .post("http://172.16.12.25:5555/login")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath().get("token");



        return token;
    }


    public static void authToPetStore(){
        String auth = given()
                .queryParam("login", "user")
                .queryParam( "password", "password")
                .contentType(ContentType.JSON)
                .accept("application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .statusCode(200)
                .extract().body().asString();

        System.out.println(auth);
    }


    public static void getProtected(String token){
        String str = given()
                .contentType(ContentType.JSON)
                .accept("application/json")
                .header("token" , token)
                .when()
                .get("http://172.16.12.25:5555/protected")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();

        System.out.println(str);
    }
}
