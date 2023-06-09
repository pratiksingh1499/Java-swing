import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class RadioButt{
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JRadioButton b1 = new JRadioButton("male", null, false);
        b1.setBounds(50, 100, 80, 20);
        f.add(b1);

        JRadioButton b2 = new JRadioButton("female", null, false);
        b2.setBounds(150, 100, 80, 20);
        f.add(b2);

        ButtonGroup gender = new ButtonGroup();
        gender.add(b1);
        gender.add(b2);

    
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}