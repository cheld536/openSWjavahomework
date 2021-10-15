package 실습.p2.app;
import 실습.p2.base.Shape;
import 실습.p2.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
