import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//button daba ke laal krne wala
public class Main{
    public static void main(String[] args){
        JFrame f = new JFrame("Notepad");
        
        JButton b = new JButton("click");
        b.setBounds(100, 100, 150, 50);
        f.add(b);

        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                System.out.println("here");
                f.getContentPane().setBackground(Color.RED);
            }
        });

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}