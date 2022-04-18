package Semana2.IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Magic.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            String s ="Hola viajeros de \n Innovacion virtual";
            byte []b = s.getBytes(StandardCharsets.UTF_8);
            bout.write(b);
            bout.flush();
            bout.close();
            fos.close();
            System.out.println("Listo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
