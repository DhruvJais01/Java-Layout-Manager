import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample2 implements ActionListener {
    private final JFrame jFrame;
    CardLayout cardLayout;
    JButton btn1,btn2,btn3;
    Container container;
    CardLayoutExample2(JFrame jf){
        this.jFrame=jf;
        container=jFrame.getContentPane();
        cardLayout=new CardLayout(140,130);  // 140 hgap, 130vgap
        container.setLayout(cardLayout);

        btn1=new JButton("Apple");
        btn2=new JButton("Boy");
        btn3=new JButton("Cat");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        container.add(btn1);
        container.add(btn2);
        container.add(btn3);

    }
    @Override
    public  void actionPerformed(ActionEvent e){
        cardLayout.next(container);
    }
}
