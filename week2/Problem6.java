import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        System.out.println("금액을 입력하시오>>");
        Scanner s = new Scanner(System.in);
        int money = s.nextInt();

        int[] unit = {50000, 10000,1000,500,100,50,10,1};

        for(int i = 0; i<unit.length; i++)
        {
            int n = money/unit[i];
            if(n !=0)
                System.out.println(unit[i]+"원짜리 : "+ n + "개");
            money -= unit[i]*n;
        }
    }
}
