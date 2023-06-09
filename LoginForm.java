import javax.swing.*;
import java.awt.event.*;

public class LoginForm{
    public static void main(String[] args){
        JFrame f = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username");
        l1.setBounds(50,80,100,50);
        f.add(l1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(200,100,100,20);
        f.add(tf1);


        JLabel l2 = new JLabel("Password");
        l2.setBounds(50,110,100,50);
        f.add(l2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200,130,100,20);
        f.add(tf2);

        JButton b = new JButton("Login");
        b.setBounds(130, 160, 80, 30);
        f.add(b);

        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                
                System.out.println("username: "+ tf1.getText());
                System.out.println("password: "+ tf2.getText());
            }
        });

        


        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

    }
}