package Semana2.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\magia.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s = "Magia";
        byte b[]=s.getBytes(StandardCharsets.UTF_8);
        try {
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
