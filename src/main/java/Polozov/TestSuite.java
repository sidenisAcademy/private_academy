package Polozov;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.io.*;
import java.util.Properties;

import static Polozov.Property.dbUserName;

public class TestSuite {

    public static void main(String[] args) {
        System.out.println("UserName  = " + dbUserName);
//        try  {
//            OutputStream output = new FileOutputStream("target/config.properties")
//            Properties prop = new Properties();
//
//            // set the properties value
//            prop.setProperty("db.url", "localhost");
//            prop.setProperty("db.name", "postgres");
//            prop.setProperty("db.user", "postgres");
//            prop.setProperty("db.password", "123qwe");
//
//            // save properties to project root folder
//            prop.store(output, null);
//
//            System.out.println(prop);
//
//        } catch (IOException io) {
//            io.printStackTrace();
//        }










    }
}
