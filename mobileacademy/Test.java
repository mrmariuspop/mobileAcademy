package ro.btrl.miswsclient.mobileacademy;

import java.io.*;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("test.dat");
        for (int i = 1; i <= 50; i++) {
            out.write(i);
        }
        out.close();
        FileInputStream in = new FileInputStream("test.dat");
        int x;
        while ((x = in.read()) != -1) {
            System.out.print(x + " ");
        }
        in.close();
    }
}