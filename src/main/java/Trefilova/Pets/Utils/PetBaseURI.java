package Trefilova.Pets.Utils;

import com.jayway.restassured.RestAssured;

import static Trefilova.JDBC.PropertiesList.petStoreUri;

public class PetBaseURI {

    public static String setBaseURI() {

        return RestAssured.baseURI = petStoreUri;
    }
}
