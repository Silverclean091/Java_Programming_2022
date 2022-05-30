package fileIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileIO {

    public static void main(String[] args) {

        File inFile = new File("infile.txt");
        try {
            FileInputStream fis = new FileInputStream(inFile);
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File outFile = new File("outFile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(outFile);
            fos.write('a');
            fos.write("가나다".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
