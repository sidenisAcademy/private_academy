package Trefilova.JDBC;

import java.io.*;
import java.util.Properties;

public class Property {
    public static void createProperty() throws IOException {
        OutputStream output = new FileOutputStream("C:/Examples/private_academy/src/main/java/Trefilova/recources/config.properties");
        Properties prop = new Properties();

        prop.setProperty("db.url", "172.16.12.15:5432");
        prop.setProperty("db.name", "postgres");
        prop.setProperty("db.user", "postgres");
        prop.setProperty("db.password", "123qwe");

        prop.store(output, null);
        System.out.println(prop);
    }

    public static void readProperty() throws IOException {
        InputStream input = new FileInputStream("C:/Examples/private_academy/src/main/java/Trefilova/recources/config.properties");
        Properties prop = new Properties();
        prop.load(input);

        System.out.println(prop.getProperty("db.url"));
        System.out.println(prop.getProperty("db.name"));
        System.out.println(prop.getProperty("db.user"));
        System.out.println(prop.getProperty("db.password"));
    }

}
