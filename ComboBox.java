import javax.swing.*;
import java.awt.event.*;

public class ComboBox{
    public static void main(String[] args) {
        JFrame f = new JFrame();

        String[] values = {"pratik","ankit","vijay","tiwari","vishal"};

        JComboBox c = new JComboBox(values);
        c.setBounds(100,100,100,30);
        f.add(c);

        JButton b = new JButton("click me", null);
        b.setBounds(300, 100, 100, 30);
        f.add(b);

        JLabel l = new JLabel("", null, 0);
        l.setBounds(100, 300, 100, 30);
        f.add(l);

        //anonymous inner class
        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                String item = (String)c.getSelectedItem();
                l.setText(item);
            }
        });
        

        

    
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}