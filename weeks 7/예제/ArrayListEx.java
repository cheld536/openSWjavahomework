package practice;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        //var c = new ArrayList<String>();  이 방식도 위랑 동일

        Scanner s = new Scanner(System.in);
        for(int i = 0 ; i<4; i++){
            System.out.print("이름을 입력하세요>> ");
            String name = s.next();             //키보드 입력
            a.add(name);                        // 입력받은 이름을 ArrayList 컬렉션에 삽입

        }

        for(int i=0; i<a.size(); i++){
            String name = a.get(i);
            System.out.print(name + " ");
        }

        int longestindex = 0;
        for(int i = 1; i<a.size(); i++){
            if(a.get(longestindex).length() < a.get(i).length())
                longestindex = i;
        }
        System.out.println("\n 가장 긴 이름은 : " + a.get(longestindex));
    s.close();
    }

}
