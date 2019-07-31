package Olga;

import java.io.*;
import java.util.Properties;
//import java.util.Properties;
import static Olga.Property.*;


public class GeneratePropertyFile {

    public static void main(String[] args) throws IOException {

        //create file and set property
        OutputStream output = new FileOutputStream("target/config.properties");
        Properties prop = new Properties();
        prop.setProperty("db.url", "172.16.12.15:5432");
        prop.setProperty("db.name", "postgres");
        prop.setProperty("db.user", "postgres");
        prop.setProperty("db.password", "123qwe");
        prop.store(output, null);
        System.out.println(prop);

        //get property
        System.out.println("DB  = " + dbUrl+"/"+ dbName);

    }










}
