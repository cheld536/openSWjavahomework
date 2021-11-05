package Problem;
import java.io.*;

public class p2 {
    public static void main(String[] args) {
        BufferedReader fr = null;
        File f = new File("C:\\Users\\김윤희\\IdeaProjects\\Weeks8\\src\\Problem\\phone.txt");
        try{
            fr = new BufferedReader(new FileReader(f));
            while (true){
                String line = fr.readLine();
                if(line ==null)
                    break;
                System.out.print(line + "\n");
            }
            fr.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
