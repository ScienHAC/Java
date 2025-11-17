package com.krmu.Assignment4;

import java.io.*;

public class Question3 {
    public static void run() {
        System.out.println("=== Question 3: Java I/O Streams Demo ===");

        System.out.println("1. Byte Stream Example:");
        try {
            FileOutputStream fos = new FileOutputStream("byte.txt");
            fos.write(65);
            fos.close();

            FileInputStream fis = new FileInputStream("byte.txt");
            System.out.println("Read byte: " + fis.read());
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n2. Character Stream Example:");
        try {
            FileWriter fw = new FileWriter("char.txt");
            fw.write("Hello World");
            fw.close();

            FileReader fr = new FileReader("char.txt");
            int ch;
            System.out.print("Read characters: ");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n3. Buffered Stream Example:");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));
            bw.write("Buffered streams are faster");
            bw.newLine();
            bw.write("They reduce I/O operations");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("buffered.txt"));
            String line;
            System.out.println("Read lines:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
    }
}

