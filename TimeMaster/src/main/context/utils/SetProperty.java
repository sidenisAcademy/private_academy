package context.utils;

import java.io.*;
import java.util.Properties;

public class SetProperty {

    public static final SetProperty INSTANCE = new SetProperty();

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
