package REST_testing.Kutsenko.PetStore.Utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DB {

    public static final String dbServer;
    public static final String dbUrl;
    public static final String dbName;
    public static final String dbUser;
    public static final String dbPass;

    static {
        dbServer = getProp("db.server");
        dbUrl = getProp("db.url");
        dbName = getProp("db.name");
        dbUser = getProp("db.user");
        dbPass = getProp("db.pass");
    }

    private static String getProp(String key) {
        String value = null;
        try (InputStream input = new FileInputStream("resources/NK.properties")) {
            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            value = prop.getProperty(key);

        } catch (Exception e) {
            System.out.println(e);
        }
        return value;
    }
}
