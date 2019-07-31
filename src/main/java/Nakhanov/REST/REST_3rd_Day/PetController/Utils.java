package Nakhanov.REST.REST_3rd_Day.PetController;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.filter.log.LogDetail;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;

public class Utils {


    public static RequestSpecification setSpec() {

        RestAssured.baseURI = "";
        RequestSpecification reqSpec = new RequestSpecBuilder()
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setBaseUri("https://petstore.swagger.io/v2/pet/")
                .log(LogDetail.ALL)
                .build();
        return reqSpec;

    }
}
