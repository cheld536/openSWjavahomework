public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d,e;

        a = null;
        d = c;
        c = null;

        System.gc(); // 가비지 컬렉션 작동 요청
    }
}
