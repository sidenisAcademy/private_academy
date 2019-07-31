package Trefilova.RESTpractices;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.ResponseBody;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;


public class Headers {

    public static void main(String[] args) {
//        List<Header> response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get("https://petstore.swagger.io/v2/pet/2210")
//                .then()
//                .statusCode(404)
//                .extract()
//                .headers()
//                .asList();

//        for(Header header : response) {
//            System.out.println(header.getName() + " = " + header.getValue());
//        }
//
//        System.out.println("\nWith forEach():\n");
//
//        response.forEach((r) -> System.out.println(r));

        String resp1 = given()
                .contentType(ContentType.JSON)
                .post("https://petstore.swagger.io/v2/user/login?username=user&password=password")
                .then()
                .extract()
                .body()
                .asString();

        //System.out.println(resp1);

        String resp2 = given()
                .auth()
                .basic("user","password")
                .post("https://petstore.swagger.io/v2/user/login")
                .then()
                .extract()
                .body()
                .asString();

        //System.out.println(resp2);

        String resp3 = given()
                .contentType(ContentType.JSON)
                .body("{\"email\":\"monkey@mail.ru\",\"password\":\"pSwD\"}")
                .post("http://172.16.12.25:5555/register")
                .then()
                .extract()
                .body()
                .asString();

        System.out.println(resp3);

        String resp4 = given()
                .contentType(ContentType.JSON)
                .body("{\"email\":\"monkey@mail.ru\",\"password\":\"pSwD\"}")
                .post("http://172.16.12.25:5555/login")
                .then()
                .extract()
                .body()
                .jsonPath()
                .get("token");

        //Iterator<String> keysItr =

        Map<String, String> map = new HashMap<>();
        //map.put(resp4.substring(2, resp4.indexOf(":") - 1), resp4.substring(resp4.indexOf(":") + 2, resp4.length() - 2));

//        for (String value : map.keySet()) {
//            System.out.println(value);
//        }

        String resp5 = given()
                .contentType(ContentType.JSON)
                .when()
                .header("token", resp4)
                .get("http://172.16.12.25:5555/protected")
                .then()
                .extract()
                .body()
                .asString();

        System.out.println(resp5);

    }
}
