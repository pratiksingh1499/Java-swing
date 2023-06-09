import javax.swing.*;
import java.util.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Registration_form{
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration form");

        JLabel l1 = new  JLabel("Name", null, 0);
        l1.setBounds(20, 50, 50, 20);
        f.add(l1);

        JTextField tf1 = new JTextField(null, null, 0);
        tf1.setBounds(120, 55, 100, 20);
        f.add(tf1);

        JLabel l2 = new  JLabel("Mobile", null, 0);
        l2.setBounds(20, 100, 50, 20);
        f.add(l2);

        JTextField tf2 = new JTextField(null, null, 0);
        tf2.setBounds(120, 100, 100, 20);
        f.add(tf2);

        JLabel l3 = new  JLabel("Gender", null, 0);
        l3.setBounds(20, 150, 50, 20);
        f.add(l3);

        JRadioButton rb1 = new JRadioButton("Male", null, false);
        rb1.setBounds(120, 150, 100, 20);
        f.add(rb1);

        JRadioButton rb2 = new JRadioButton("Female", null, false);
        rb2.setBounds(230, 150, 100, 20);
        f.add(rb2);

        ButtonGroup Gender = new ButtonGroup();
        Gender.add(rb1);
        Gender.add(rb2);

        JLabel l4 = new  JLabel("DOB", null, 0);
        l4.setBounds(20, 200, 50, 20);
        f.add(l4);

        ArrayList<Integer> Day= new ArrayList<>();
        for(int i =1;i<=31; i++){
            Day.add(i);
        }

        JComboBox c1 = new JComboBox(Day.toArray(new Integer[0]));
        c1.setBounds(120,200,40,20);
        f.add(c1);

        String[] Month = {"jan","feb","mar","apr","may","june","july","aug","sept","nov","dec",};

        JComboBox c2 = new JComboBox(Month);
        c2.setBounds(180,200,50,20);
        f.add(c2);

        ArrayList<Integer> Year= new ArrayList<>();
        for(int i =1950;i<=2023; i++){
            Year.add(i);
        }

        JComboBox c3 = new JComboBox(Year.toArray(new Integer[0]));
        c3.setBounds(250,200,60,20);
        f.add(c3);

        JLabel l5 = new  JLabel("Address", null, 0);
        l5.setBounds(20, 250, 50, 20);
        f.add(l5);

        JTextArea ta = new JTextArea();
        ta.setBounds(120, 240, 200, 60);
        f.add(ta);

        JCheckBox cb = new JCheckBox("please accept terms and conditions", null, false);
        cb.setBounds(60, 300, 200, 50);
        f.add(cb);

        JButton b = new JButton("Submit", null);
        b.setBounds(140, 350, 100, 30);
        f.add(b);
        
        JLabel l = new JLabel("accept terms and conditions to submit", null, 0);
        l.setBounds(50, 400, 220, 50);
        f.add(l);

        JTextArea ta1 = new JTextArea();
        ta1.setVisible(true);
        ta1.setBounds(450, 50, 300, 300);
        
        f.add(ta1);

        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                              
                System.out.println(ta1.getText());
                String name = tf1.getText();
                ta1.setText("Name: "+name);

                System.out.println(ta1.getText());
                String mob = tf2.getText();
                ta1.setText(ta1.getText()+"number: "+mob);

                
            }
        });

    
        f.setSize(800,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}