package createFileObject;

import java.io.File;

public class CreateFileObject {

    public static void main(String[] args) {

        String str = "abcd1234";
        byte[] strByte = str.getBytes();
        for (int i = 0; i < strByte.length; i++) {
            System.out.println((char)strByte[i]);
        }

        System.out.println();


        File file= new File("C:\\Windows\\write.exe");

        if (file.exists()) {
            System.out.println(file.toString() + " is exists");
        }
        else {
            System.out.println(file + " is not exists");
        }



    }
}
