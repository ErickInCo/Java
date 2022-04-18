package Semana2.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            int i =fis.read();
            System.out.println((char)i);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
