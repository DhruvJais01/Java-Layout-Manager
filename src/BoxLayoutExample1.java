import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


//public class BoxLayoutExample1 extends Frame{
//    private final JFrame jFrame;
//    Button buttons[];
//    public BoxLayoutExample1(JFrame jf) {
//        this.jFrame=jf;
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        buttons = new Button[5];
//        for (int i = 0; i < 5; i++) {
//            buttons[i] = new Button("Button " + (i + 1));
//            add(buttons[i]);
//        }
//        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
//        setSize(400,400);
//        setVisible(true);
//    }
//}
//--------------------------------------------------or------------------------------

public class BoxLayoutExample1 {
    private final JFrame jFrame;
    Button buttons[];
    BoxLayoutExample1(JFrame jf){
        this.jFrame=jf;
        buttons=new Button[5];
        JPanel panel=new JPanel();
//        BoxLayout boxLayout=new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder( new EmptyBorder( new Insets(100,150,100,150)));
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            panel.add(buttons[i]);
        }
        jFrame.add(panel);
        jFrame.pack();

    }
}