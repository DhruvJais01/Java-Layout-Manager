import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    JFrame jFrame;
    Main(){
        jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//-----------------------------------------------------------
        BoxLayoutExample3 Example=new BoxLayoutExample3(jFrame);
// ----------------------------------------------------------
        jFrame.setSize(600,600);
        jFrame.setVisible(true);

    }
    public static void main(String[] args) {
        new Main();
    }
}