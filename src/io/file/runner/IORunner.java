package io.file.runner;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IORunner extends IOException{



    public static void createFile() throws IOException {
        FileReader fr = null;
        try {
            File f = new File("file/oneDB.txt");
            fr = new FileReader(f);
            StringBuffer s = new StringBuffer();


            int i = 0;
            while ((i = fr.read()) != -1) {
                s.append((char) i);
            }
            System.out.println(s.toString());
        } catch (Exception e) {
            e.printStackTrace();
            fr.close();

        }
    }
}