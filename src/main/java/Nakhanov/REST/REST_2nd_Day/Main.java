package Nakhanov.REST.REST_2nd_Day;

import com.jayway.restassured.response.Header;

import java.util.List;


public class Main {

    public static void getHeader() {
        List<Header> headers = Controllers.headerRequestById(6695, 404);
        headers.forEach(System.out::println);

    }
    public static void main(String[] args) {

//        getHeader();
//        String str1 = authToPetStore();
//        System.out.println(str1);
//        Controllers.authToPetStore();

//        Controllers.registationOnDashaSwagger();
        String token = Controllers.loginToDashaSwagger();
//        System.out.println(token);
        Controllers.getProtected(token);


        }
    }

