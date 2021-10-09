abstract class PairMap{
    protected String KeyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap {
    private int num;

    // 생성자 초기화
    public Dictionary(int n) {
        num = 0;
        KeyArray = new String[n];
        valueArray = new String[n];
    }

    String get(String key) {
        for (int i = 0; i < num; i++) {
            if (KeyArray[i].equals(key)) {
                return valueArray[i];

            }
        }
        return null;
    }

    void put(String key, String value) {
        for (int i = 0; i < num; i++) {
            if (KeyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
            }
        }
        valueArray[num] = value;
        KeyArray[num++] = key;
        return;
    }

    String delete(String key) {
        String deleteData = null;
        for(int i=0;i<num;i++) {
            //삭제하려는 키값이 존재하면 저장 후 삭제
            if(KeyArray[i].equals(key)){
                deleteData=valueArray[i];
                for(int j=i;j<num-1;j++) {
                    valueArray[j]=valueArray[j+1];
                    KeyArray[j] = KeyArray[j+1];
                }
                num--;
            }
        }
        //저장한 값을 반환
        return deleteData;
    }

    int length(){
        return num;
    }
}

public class p5 {
    public static void main(String[] args) {

        Dictionary dic=new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문","파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}
