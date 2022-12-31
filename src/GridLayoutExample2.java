import javax.swing.*;
import java.awt.*;

public class GridLayoutExample2 {
    private
    JFrame jFrame;
    public GridLayoutExample2(JFrame jf) {
        this.jFrame=jf;
        JButton btn1=new JButton("1");
        JButton btn2=new JButton("2");
        JButton btn3=new JButton("3");
        JButton btn4=new JButton("4");
        JButton btn5=new JButton("5");
        JButton btn6=new JButton("6");
        JButton btn7=new JButton("7");


        jFrame.setLayout(new GridLayout(3,3));
        jFrame.add(btn1);
        jFrame.add(btn2);
        jFrame.add(btn3);
        jFrame.add(btn4);
        jFrame.add(btn5);
        jFrame.add(btn6);
        jFrame.add(btn7);
    }
}
