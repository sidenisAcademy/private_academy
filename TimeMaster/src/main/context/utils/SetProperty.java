package context.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SetProperty {

    public static Properties properties;

    public static void setProperties(){
        try {
            properties = new Properties();
            InputStream input = new FileInputStream("TimeMaster\\env\\defualt\\default.properties");
            properties.load(input);
            input = new FileInputStream("TimeMaster\\env\\defualt\\user.properties");
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
