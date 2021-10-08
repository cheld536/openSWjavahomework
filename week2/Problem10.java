import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[][] = new int[4][4];
        int x,y,result = 0;

        while(result < 10)
        {
            x= (int)(Math.random()*4);
            y=(int)(Math.random()*4);
            if(array[y][x]==0)
            {
                array[y][x] = (int)(Math.random()*10+1);
                result++;
            }
        }
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j< array[i].length; j++)
            {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
