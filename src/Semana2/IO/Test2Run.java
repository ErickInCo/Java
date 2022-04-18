package Semana2.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2Run {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream("C:\\magiarunable.txt");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                String s = "Magia con runable";
                byte b[]=s.getBytes(StandardCharsets.UTF_8);
                try {
                    fos.write(b);
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread magic = new Thread(rm);
        magic.run();
    }
}
