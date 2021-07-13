package ro.btrl.miswsclient.mobileacademy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesExample {

    public static void main(String[] args) {

        try {
            int f = 1000;

            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");

            raf.writeInt(f);

            raf.seek(0);
            System.out.println("" + raf.readInt());

            raf.seek(0);
            raf.writeInt(200);

            raf.seek(0);
            System.out.println("" + raf.readInt());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
