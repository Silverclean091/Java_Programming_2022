package fileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo2 {

    public static void main(String[] args) {

        File file = new File("test.txt");
        int data;

        try { // 예외가 발생할 가능성이 있는 명령어는 try 안에 적기
            FileInputStream fis = new FileInputStream(file);
            byte[] bs = new byte[fis.available()];
            int i = 0;
            while ((data = fis.read()) != -1 ) {
                bs[i++] = (byte)data;
            }
            String str = new String(bs);
            System.out.println(str);
            fis.close();
        }
        catch (IOException e) {
            // 괄호 안에 입력한 예외 발생 시, 그냥 패스
            // System.out.println("파일이 없으니 다시 확인해보세요.");
            e.printStackTrace();
        }

    }

}
