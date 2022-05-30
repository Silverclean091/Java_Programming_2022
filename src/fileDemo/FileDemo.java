package fileDemo;

public class FileDemo {

    public static void main(String[] args) {

        String str = "abcd1234";
        byte[] byteStr = str.getBytes();

        for (int i = 0; i < byteStr.length; i++) {
            // char로 캐스팅하지 않으면 byte인 숫자로 나타나게 됨
            System.out.println((char)byteStr[i]);
        }


        String str2 = "가나다라";
        byte[] byteStr2 = str2.getBytes();

        for (int i = 0; i < byteStr2.length; i++) {
            // char로 캐스팅하지 않으면 byte인 숫자로 나타나게 됨
            System.out.println((char)byteStr2[i]);
        }
        String str3 = new String(byteStr2);
        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));
        }

    }

}
