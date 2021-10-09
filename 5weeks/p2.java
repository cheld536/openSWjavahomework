import java.util.Scanner;

abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected  double ratio;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val=scanner.nextDouble();
        double res=convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다.");
        scanner.close();
    }
}


class Km_mile extends Converter{
    public Km_mile(double ratio) {
        this.ratio=ratio;
    }
    protected double convert(double src) {
        return src/ratio;
    }

    protected String getSrcString() {
        return "Km";
    }

    protected String getDestString() {
        return "mile";
    }

}

public class p2 {
    public static void main(String[] args) {

        Km_mile toMile=new Km_mile(1.6);
        toMile.run();
    }
}
