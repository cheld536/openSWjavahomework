import java.util.Scanner;

public class practice4_2 {
    int width;
    int height;

    public int getArea(){
        return width * height;
    }

    public static void main(String[] args) {
        practice4_2 rect = new practice4_2();
        Scanner s = new Scanner(System.in);
        System.out.println(">>");

        rect.width = s.nextInt();
        rect.height = s.nextInt();

        System.out.println("사각형의 면적은 "+rect.getArea());

        s.close();
    }
}
