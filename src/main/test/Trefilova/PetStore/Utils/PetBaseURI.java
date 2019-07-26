package Trefilova.PetStore.Utils;

import com.jayway.restassured.RestAssured;

public class PetBaseURI {

    public static String setBaseURI() {

        return RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
    }
}
