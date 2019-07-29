package Polozov;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Property {

    public static final String dbUserName;
    static {
        dbUserName = getPropertie("db.user");
    }


    private static String getPropertie(String name) {
        try  {

            InputStream input = new FileInputStream("resources/config.properties");
            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out

            return prop.getProperty(name);
        } catch (IOException ex) {
            ex.printStackTrace();
            return "";
        }
    }
}
