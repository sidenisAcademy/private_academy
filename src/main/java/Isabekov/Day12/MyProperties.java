package Isabekov.Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import static Isabekov.Constants.*;

public class MyProperties {

  //  СОЗДАЕМ ФАЙЛ
    public static void generate()throws Exception {
        OutputStream output = new FileOutputStream("target/config.properties");
        Properties prop = new Properties();
//        set the properties value
        prop.setProperty("db.url", "jdbc:postgresql://172.16.12.15:5432/postgres");
        prop.setProperty("db.name", "postgres");
        prop.setProperty("db.user", "postgres");
        prop.setProperty("db.password", "123qwe");
        // save properties to project root folder

        prop.store(output, null);

         System.out.println(prop);

//    catch(Exception e){
//            e.getStackTrace();
//        }
    }

    // ЧИТАЕМ ФАЙЛ
    public static void read() throws Exception{
        InputStream input = new FileInputStream("C:\\Users\\Emil.Isabekov\\Desktop\\JAVA\\REP\\privat_academy\\resource\\config.properties");
        Properties prop = new Properties();
        // load a properties file
        prop.load(input);

        // get the property value and print it out
        System.out.print(prop.getProperty("db.url"));
        System.out.print(prop.getProperty("db.user"));
        System.out.print(prop.getProperty("db.password"));
// localhost postgres 123qwe

    }

    public static void main(String[] args) throws Exception {
        //generate();
        read();
    }
}

