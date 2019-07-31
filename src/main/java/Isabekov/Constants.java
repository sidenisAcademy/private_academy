package Isabekov;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Constants {
    public static final String dbUrl;
    public static final String dbUser;
    public static final String dbPassword;

    static {
        dbUrl = getProperty("db.url");
        dbUser = getProperty("db.user");
        dbPassword = getProperty("db.password");
    }


    private static String getProperty(String key) {
        try {
            InputStream input = new FileInputStream("C:\\Users\\Emil.Isabekov\\Desktop\\JAVA\\REP\\privat_academy\\resource\\config.properties");
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.print(prop.getProperty("db.url"));
            System.out.print(prop.getProperty("db.user"));
            System.out.print(prop.getProperty("db.password"));
            return prop.getProperty(key);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
// localhost postgres 123qwe


    }
}