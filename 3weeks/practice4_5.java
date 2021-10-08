public class practice4_5 {
    String title;
    String author;
    void show() { System.out.println(title + " " + author);}

    public practice4_5(){
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public practice4_5(String title){
        this(title,"작자미상");
    }

    public  practice4_5(String title, String author){
        this.title = title; this.author = author;
    }

    public static void main(String[] args) {
        practice4_5 littlePrince = new practice4_5("어린왕자", "생텍쥐페리");
        practice4_5 loveStory = new practice4_5("춘향전");
        practice4_5 emptyBook = new practice4_5();
        loveStory.show();


    }
}
