package Gaisenok;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {
    void readFiles(String fileName) throws IOException {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        try (FileInputStream myFile = new FileInputStream
                (new File(classLoader
                        .getResource(fileName)
                        .getFile()));) {
            int content;
            while ((content = myFile.read()) != -1) {

                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.getStackTrace();}
        }
    }