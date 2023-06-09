import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class CheckBox{
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JCheckBox b1 = new JCheckBox("male", null, false);
        b1.setBounds(50, 100, 80, 20);
        f.add(b1);
 
        JCheckBox b2 = new JCheckBox("female");
        b2.setBounds(150, 100, 80, 20);
        f.add(b2);

        

    
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}