import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BoxLayoutExample2 {
    private final JFrame jFrame;
    Button buttons[];
    public BoxLayoutExample2(JFrame jf) {
        this.jFrame=jf;
        buttons=new Button[5];
        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        panel.setBorder( new EmptyBorder( new Insets(100,150,100,150)));
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            panel.add(buttons[i]);
        }
        jFrame.add(panel);
        jFrame.pack();
    }
}
