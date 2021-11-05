package Practice_Problem;
import java.io.*;

public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin1 = null;
        try {
            fin1 = new FileInputStream("C:\\Users\\김윤희\\IdeaProjects\\Weeks8\\src\\Practice_Problem\\hangul.txt");
            in = new InputStreamReader(fin1, "MS949");
            int c;
            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            in.close();
            fin1.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
