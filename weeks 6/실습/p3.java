package 실습;
import java.util.Scanner;
import java.util.Calendar;

class Player{
    private String name;
    private int second;
    public Player(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public int getSecond(){
        return second;
    }
}
class TimeGame {
    Scanner sc = new Scanner(System.in);
    private Player[] player;

    public void Set() {
        player = new Player[2];
        player[0] = new Player("주시원");
        player[1] = new Player("김윤희");
    }

    public void Run(){
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        for(int i = 0; i<player.length; i++){
            System.out.println(player[i].getName() + "시작 <Enter>키 >>");
            String key = sc.nextLine();
            int startSecond = Calendar.getInstance().get(Calendar.SECOND);
            System.out.println("현재 초 시간 = " + startSecond);

            System.out.println("10초 예상 후 <Enter>키 >>");
            key = sc.nextLine();
            int endSecond = Calendar.getInstance().get(Calendar.SECOND);
            System.out.println("현재 초 시간 = " + endSecond);

            if(endSecond < startSecond)
                player[i].setSecond(endSecond-startSecond+60);
            else
                player[i].setSecond(endSecond-startSecond);
        }
    }
    public void Result(){
        for(int i=0; i<player.length; i++){
            System.out.print(player[i].getName() + "의 결과 " + player[i].getSecond() + ", ");
        }
        if(Math.abs(player[0].getSecond()) < Math.abs(player[1].getSecond()))
            System.out.println("승자는 " + player[0].getName());
        else
            System.out.println("승자는 " + player[1].getName());
    }
}

public class p3 {
    public static void main(String[] args) {
        TimeGame tg = new TimeGame();
        tg.Set();
        tg.Run();
        tg.Result();
    }
}
