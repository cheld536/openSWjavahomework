package 실습;
class circle{
    private int x, y,radius;
    public circle(int x, int y,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public String toString() {
        return "Circle("+x+","+y+")반지름"+radius;
    }
    public boolean equals(Object obj) {
        circle p = (circle)obj;
        if(p.x == x && p.y == y) //중심이 같으면 같은 원이다.
            return true;
        else
            return false;
    }
}
public class p1 {
    public static void main(String[] args) {
        circle a = new circle(2,3,5);
        circle b = new circle(2,3,30);
        System.out.println("원 a: " + a);
        System.out.println("원 b: " + b);
        if(a.equals(b))
            System.out.println("같은 원 ");
        else
            System.out.println("서로 다른 원");
    }
}
