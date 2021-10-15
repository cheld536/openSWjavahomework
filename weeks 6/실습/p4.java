package 실습;

import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 문자열을 입력하세요. 빈칸이 있어도 되고 영어, 한글 모두 다 됩니다. : )");

        String s = scanner.nextLine();

        for(int i = 0; i< s.length(); i++){
            String b = s.substring(0,1);
            String c = s.substring(1);
            s = c + b;
            System.out.println(s);
        }
    }
}
