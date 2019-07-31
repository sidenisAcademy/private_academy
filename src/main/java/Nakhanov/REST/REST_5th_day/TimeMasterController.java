package Nakhanov.REST.REST_5th_day;

import com.jayway.restassured.http.ContentType;

import java.io.File;

import static Nakhanov.Constant.*;
import static com.jayway.restassured.RestAssured.given;

public class TimeMasterController {

    public static String getWhoAmIController() {

        return given().relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .cookie(timeMasterCSRFName,
                        timeMasterCSRFToken)
                .cookie(timeMasterYumName, timeMasterYumId)
                .cookie(timeMasterSessionName, timeMasterSessionId)
                .when()
                .get(timeMasterBaseUrl + "whoami/")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
//                .asString();
                .jsonPath()
                .get("full_name");


    }

    public static String getInfoForCurrentUserController() {

        return given().relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .cookie(timeMasterCSRFName,
                        timeMasterCSRFToken)
                .cookie(timeMasterYumName, timeMasterYumId)
                .cookie(timeMasterSessionName, timeMasterSessionId)
                .when()
                .get(timeMasterBaseUrl + "time_tracker/current_user/2019/7/")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .asString();
    }

    public static void putCommentController() {

        given().relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .cookie(timeMasterCSRFName,
                        timeMasterCSRFToken)
                .cookie(timeMasterYumName, timeMasterYumId)
                .cookie(timeMasterSessionName, timeMasterSessionId)
                .body(new File("src/main/resources/NewPet2.json").toString())
                .when()
                .put(timeMasterBaseUrl + "days/current_user/")
                .then()
                .log().all();
    }
}
