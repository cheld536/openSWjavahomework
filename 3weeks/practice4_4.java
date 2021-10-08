public class practice4_4 {
    String title;
    String author;

    public practice4_4(String t){
        title= t; author = "작자미상";
    }
    public  practice4_4(String t, String a){
        title = t; author = a;
    }

    public static void main(String[] args) {
        practice4_4 littlePrince = new practice4_4("어린왕자", "생텍쥐페리");
        practice4_4 loveStory = new practice4_4("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
