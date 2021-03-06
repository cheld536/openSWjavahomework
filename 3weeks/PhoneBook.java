import java.util.Scanner;

class Phone{
    private String name;
    private String tel;

    public  Phone(String name, String tel)
    {
        this.name = name;
        this.tel = tel;
    }

    public String getName()
    {
        return name;
    }

    public  String getTel(){
        return tel;
    }
}

public class PhoneBook{
    Scanner s = new Scanner(System.in);
    int num;                // 인원수
    Phone phone[];
    String name;
    String tel;

    public void getNum(){
        System.out.print("인원수>>");
        num = s.nextInt();
        phone = new Phone[num];
    }
    public void getInfo(){
        for(int i=0; i<num; i++)
        {
            System.out.print("이름과 전화번호 (이름과 번호는 빈 칸 없이 입력)>>");
            name = s.next();
            tel = s.next();
            phone[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다....");

    }

    public void Search(){
        boolean state = false;
        while (true)
        {
            System.out.println("검색할 이름>>");
            name = s.next();

            if(name.equals("그만"))
            {
                break;
            }

            for (int i =0; i<num; i++)
            {
                if(name.equals(phone[i].getName())){
                    System.out.println(name+"의 번호는 "+phone[i].getTel()+"입니다.");
                    state = true;
                }
            }

            if(state == false)
            {
                System.out.println(name+" 이 없습니다.");
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.getNum();
        phoneBook.getInfo();
        phoneBook.Search();
    }
}


