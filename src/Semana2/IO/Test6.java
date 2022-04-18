package Semana2.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);
            int i;
            while ((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
