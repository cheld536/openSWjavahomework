package Add;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        int num[] = new int[args.length];
        for(int i=0; i<args.length;i++){
            try {
                num[i]=Integer.parseInt(args[i]);
            }catch (NumberFormatException e)
            {

            }
        }
        int sum=0;
        for(int i = 0; i<num.length;i++)
        {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
