
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하시오>>");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
            a--;
        }
    }
}
