package Kutsenko.PetStore.Utils;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import com.jayway.restassured.specification.ResponseSpecification;

public class Spec {

    public static RequestSpecification initRequestSpec() {

        RestAssured.basePath = "";
        return new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .build();

    }

    public static ResponseSpecification initResponseSpec() {

        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

    }

}
