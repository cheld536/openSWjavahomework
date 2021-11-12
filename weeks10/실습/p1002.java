package 실습;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

class MyFrame2 extends JFrame{
    public MyFrame2() {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GREEN);

        c.addMouseListener(new mouseListener());
        c.addMouseMotionListener(new motionListener());
        setSize(300,300);
        setVisible(true);
    }

    public class motionListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e) {
            Container c=(Container)e.getSource();
            c.setBackground(Color.yellow);
        }
    }

    public class mouseListener extends MouseAdapter{
        public void mouseReleased(MouseEvent e) {
            Container c=(Container)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }
}

public class p1002 {
    public static void main(String[] args) {

        new MyFrame2();
    }
}