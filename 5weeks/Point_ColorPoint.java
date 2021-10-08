class Point{
    private int x,y;
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.println("("+ x + "," + y + ")");
    }
}

class ColorPoint extends Point{
    private String color;        //점의 색
    public void setColor(String color){
        this.color = color;
    }
    public  void showColorPoint(){
        System.out.print(color);        // 컬러 점의 좌표 출력
        showPoint();                    // Point 클래스의 showPoint() 호출
    }
}

public class Point_ColorPoint {
    public static void main(String[] args) {
        Point p = new Point();          // point 객체 생성
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();  // 객체 생성
        cp.set(3,4);                    // point의 set 호출
        cp.setColor("red");
        cp.showColorPoint();            // 컬러와 좌표 출력력
    }
}