package Gaisenok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {
    void readFiles(String fileName) throws IOException {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        FileInputStream myFile = new FileInputStream(new File(classLoader.getResource(fileName).getFile()));
        try {
            int content;
            while ((content = myFile.read()) != -1) {

                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                if (myFile != null)
                    myFile.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}