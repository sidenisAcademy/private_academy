package Nakhanov;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Constant {

    public static final String dbUserName;
    public static final String dbUrl;
    public static final String dbName;
    public static final String dbPassword;

//    Pet Store variables
    public static final String petStoreBaseUrl;

//    TimeMaster variables

    public static final String timeMasterBaseUrl;
    public static final String timeMasterCSRFName;
    public static final String timeMasterCSRFToken;
    public static final String timeMasterSessionName;
    public static final String timeMasterSessionId;
    public static final String timeMasterYumName;
    public static final String timeMasterYumId;


    static {
//        db
        dbUserName = getProp("db.user");
        dbUrl = getProp("db.url");
        dbName = getProp("db.name");
        dbPassword = getProp("db.password");
//        pet store
        petStoreBaseUrl = getProp("petStoreBaseUrl");
//        time master
        timeMasterBaseUrl = getProp("timeMasterBaseUrl");
        timeMasterCSRFName= getProp("timeMasterCSRFName");
        timeMasterCSRFToken= getProp("timeMasterCSRFToken");
        timeMasterSessionName= getProp("timeMasterSessionName");
        timeMasterSessionId= getProp("timeMasterSessionId");
        timeMasterYumName= getProp("timeMasterYumName");
        timeMasterYumId    = getProp("timeMasterYumId");
    }


    private static String getProp(String key) {

        try (InputStream input = new FileInputStream(
                "C:\\Users\\vitalii.nakhanov\\IdeaProjects\\privat_academy\\src\\main\\java\\Nakhanov\\config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(key);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "pusto";
    }
}
