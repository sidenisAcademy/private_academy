package Trefilova.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesList {

    //DB
    public static final String dbUrl;
    public static final String dbName;
    public static final String dbUser;
    public static final String dbPassword;

    //TM
    public static final String tmUrl;
    public static final String tokenName;
    public static final String tokenValue;
    public static final String sessionName;
    public static final String sessionValue;

    //PetStore
    public static final String petStoreUri;

    static {
        dbUrl = getPropertyValue("db.url");
        dbName = getPropertyValue("db.name");
        dbUser = getPropertyValue("db.user");
        dbPassword = getPropertyValue("db.password");
        tokenName = getPropertyValue("token.name");
        tokenValue = getPropertyValue("token.value");
        sessionName = getPropertyValue("session.name");
        sessionValue = getPropertyValue("session.value");
        tmUrl = getPropertyValue("tm.url");
        petStoreUri = getPropertyValue("petstore.uri");
    }

    private static String getPropertyValue(String name) {
        InputStream input = null;
        try {
            input = new FileInputStream("C:/Examples/private_academy/src/main/java/Trefilova/recources/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(name);
    }
}
