import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample3 {
    private final JFrame jFrame;
    private  int currCard=1;

    private CardLayout cardLayout;

    CardLayoutExample3(JFrame jf){
        this.jFrame=jf;
        jFrame.setTitle("Card Layout Method");
        jFrame.setSize(310,160);
        JPanel cardPanel=new JPanel();

        cardLayout=new CardLayout();
        cardPanel.setLayout(cardLayout);

        JPanel jPanel1=new JPanel();

        JPanel jPanel2=new JPanel();

        JPanel jPanel3=new JPanel();

        JPanel jPanel4=new JPanel();

        JLabel jLabel1=new JLabel("C1");
        JLabel jLabel2=new JLabel("C2");
        JLabel jLabel3=new JLabel("C3");
        JLabel jLabel4=new JLabel("C4");

        jPanel1.add(jLabel1);
        jPanel2.add(jLabel2);
        jPanel3.add(jLabel3);
        jPanel4.add(jLabel4);

        cardPanel.add(jPanel1,"1");
        cardPanel.add(jPanel2,"2");
        cardPanel.add(jPanel3,"3");
        cardPanel.add(jPanel4,"4");

        JPanel buttonPanel=new JPanel();

        JButton firstBtn =new JButton("First");
        JButton nextBtn =new JButton("->");
        JButton previousBtn =new JButton("-<");
        JButton lastBtn =new JButton("Last");

        buttonPanel.add(firstBtn);
        buttonPanel.add(nextBtn);
        buttonPanel.add(previousBtn);
        buttonPanel.add(lastBtn);

        firstBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.first(cardPanel);
                currCard=1;
            }
        });

        lastBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.last(cardPanel);
                currCard=4;
            }
        });

        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currCard<4){
                    currCard+=1;
                    cardLayout.show(cardPanel,""+(currCard));
                }
            }
        });

        previousBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currCard>1){
                    currCard-=1;
                    cardLayout.show(cardPanel,""+(currCard));
                }
            }
        });

        jFrame.getContentPane().add(cardPanel,BorderLayout.NORTH);
        jFrame.getContentPane().add(cardPanel,BorderLayout.SOUTH);
    }
}
