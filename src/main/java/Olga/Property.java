package Olga;

import java.io.*;
import java.util.Properties;

public class Property {

    public static final String dbUrl;
    public static final String dbName;
    public static final String dbUserName;
    public static final String dbPassword;

    static {
        dbUrl = getProperty("db.url");
        dbName = getProperty("db.name");
        dbUserName = getProperty("db.user");
        dbPassword = getProperty("db.password");
    }

    private static String getProperty(String name) {
        try {
            InputStream input = new FileInputStream("resources/config.properties");
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(name);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}



