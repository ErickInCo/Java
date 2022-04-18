package Semana2.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        FileOutputStream fos;

        {
            try {
                fos = new FileOutputStream("C:\\hola.txt");
                fos.write(65);
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
