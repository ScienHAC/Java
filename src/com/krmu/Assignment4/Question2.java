package com.krmu.Assignment4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question2 {
    public static void run() {
        System.out.println("=== Question 2: Byte Streams - File Copy ===");

        String sourceFile = "source.bin";
        String destFile = "destination.bin";

        try {
            FileOutputStream fos = new FileOutputStream(sourceFile);
            String data = "Hello World! This is byte stream example.";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written to source file");

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos2 = new FileOutputStream(destFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos2.write(byteData);
            }

            fis.close();
            fos2.close();
            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
    }
}
