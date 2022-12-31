import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample1 {
    JFrame jFrame;
    BorderLayoutExample1(JFrame jF){
    this.jFrame=jF;
        JButton north=new JButton("North");
        JButton south=new JButton("South");
        JButton east=new JButton("East");
        JButton west=new JButton("West");
        JButton center=new JButton("Center");

        jFrame.add(north, BorderLayout.NORTH);
        jFrame.add(south, BorderLayout.SOUTH);
        jFrame.add(west, BorderLayout.WEST);
        jFrame.add(east, BorderLayout.EAST);
        jFrame.add(center, BorderLayout.CENTER);
    }
}
