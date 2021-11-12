package 실습;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame4 extends JFrame{
    public MyFrame4() {
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel j=new JLabel("Love Java");
        c.add(j);
        c.setFocusable(true);
        c.requestFocus();
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                    String text=j.getText();
                    j.setText(text.substring(1)+text.charAt(0));
                }
            }
        });

        setSize(300,300);
        setVisible(true);
    }
}

public class p1004 {
    public static void main(String[] args) {
        new MyFrame4();
    }
}