package ProjectGameJava;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {

       public GUI() {

        // Basic GUI JFRAME
        JFrame frame = new JFrame(); // Create Object
        frame.setTitle("Test GUI Code");
        frame.setSize(500 , 1000 ); // set Size with Object
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit Program
        frame.setResizable(true); // allow resize
        frame.setVisible(true); // set Program for output


        // กำหนด Layout Manager
        frame.setLayout(new java.awt.FlowLayout()); // Grid and Flow // Create LayOut

        // button
        JButton btn = new JButton("Exit"); // Create new OBJ Button
        btn.setText("Click"); // add new Text
        JButton btn2 = new JButton("Exit");



        // Label
        JLabel lb = new JLabel();
        lb.setText("Test Gui and Learning Gui"); // setText Label
        

        //add label
        frame.add(lb);
        frame.add(btn); // add Botton OBJ
        frame.add(btn2); // Add Botton OBJ Exit

         btn.addActionListener(new ActionListener() { //Action 

            @Override 
                public void actionPerformed(ActionEvent e) {
                    lb.setText("HELLO NIGGER"); // Add more Text
                }
        });

        btn2.addActionListener(new ActionListener() {
            
            @Override 
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit Program when Click Exit
            }
        });
    }
}