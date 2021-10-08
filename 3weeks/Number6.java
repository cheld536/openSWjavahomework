import java.util.Scanner;
class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius)
    {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }
    public int getR(){
        return radius;
    }
}
public class Number6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle c [] = new Circle[3];
        for(int i=0; i< c.length; i++)
        {
            System.out.print("x, y, radius >>");
            double x = s.nextDouble();
            double y = s.nextDouble();
            int radius = s.nextInt();
            c[i] = new Circle(x,y,radius);
        }
        int tmp = 0;
        for (int z = 1; z < c.length; z++)
        {
            if(c[tmp].getR() < c[z].getR())
                tmp = z;
        }

        System.out.print("가장 면적이 큰 원은");
        c[tmp].show();
        s.close();
    }
}
