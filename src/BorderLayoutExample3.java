import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample3 {
    JFrame jFrame;
    public BorderLayoutExample3(JFrame jf) {
        this.jFrame=jf;
        JButton north=new JButton("North");
        JButton south=new JButton("South");
        JButton east=new JButton("East");
        JButton west=new JButton("West");
        JButton center=new JButton("Center");

        jFrame.setLayout(new BorderLayout(7,7));
        jFrame.add(north);
        jFrame.add(south);
        jFrame.add(west);
        jFrame.add(east);
        jFrame.add(center);
        // each button covers the whole area

    }
}
