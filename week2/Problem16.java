import java.util.Scanner;
public class Problem16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        String str[] = {"가위","보","바위"};
        String user;
        do{
            System.out.print("가위 바위 보!>>");
            user =scan.next();
            if(user.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }

            int n = (int)(Math.random()*3);
            int user_num = 3;
            for(int i = 0; i<str.length;i++)
                if (str[i].equals(user))
                    user_num=i;

            if(user_num ==0)
            {
                if(n==0)
                    System.out.println("사용자="+str[user_num]+", 컴퓨터="+str[n]+"비겼습니다.");
                else if(n==1)
                    System.out.println("사용자="+str[user_num]+", 컴퓨터="+str[n]+"컴퓨터가 이겼습니다.");
                else
                    System.out.println("사용자="+str[user_num]+", 컴퓨터="+str[n]+"사용자가 이겼습니다.");
            }
            else if(user_num==1) {
                if (n == 0)
                    System.out.println("사용자=" + str[user_num] + ", 컴퓨터=" + str[n] + "사용자가 이겼습니다.");
                else if (n == 1)
                    System.out.println("사용자=" + str[user_num] + ", 컴퓨터=" + str[n] + "비겼습니다.");
                else
                    System.out.println("사용자=" + str[user_num] + ", 컴퓨터=" + str[n] + "컴퓨터가 이겼습니다.");
            }
            else if(user_num==2){
                if(n==0)
                    System.out.println("사용자="+str[user_num]+", 컴퓨터="+str[n]+" 컴퓨터가 이겼습니다..");
                else if(n==1)
                    System.out.println("사용자="+str[user_num]+", 컴퓨터="+str[n]+" 사용자가 이겼습니다.");
                else
                    System.out.println("사용자="+str[user_num]+", 컴퓨터="+str[n]+" 비겼습니다.");
            }else{
                System.out.println("다시 입력해주세요.");
            }
        }while (user != "그만");
    }
}
