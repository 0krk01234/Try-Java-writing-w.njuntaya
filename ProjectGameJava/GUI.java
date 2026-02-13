package ProjectGameJava;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics; 
import javax.swing.*;
import java.awt.Image; 

public class GUI {

       public GUI() {

        // Basic GUI JFRAME
        JFrame frame = new JFrame(); // Create Object
        frame.setTitle("Test GUI Code");
        //frame.setSize(500 , 1000 ); // set Size with Object
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // FULLSCREEN
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit Program
        frame.setResizable(true); // allow resize
        frame.setVisible(true); // set Program for output


        //Dowload Picture
        ImageIcon icon = new ImageIcon("b11395e8-97f6-4043-80fb-d6d4fdacf3a5.png");//Image
        Image img = icon.getImage();

        ImageIcon Photo_cover = new ImageIcon("maxresdefault.jpg");
        Image img2 = Photo_cover.getImage();



        // Jpanel add พื้นหลัง
        JPanel backgroundPanel = new JPanel() {
        @Override

            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    };  

        

        backgroundPanel.setLayout(null); // เพื่อให้วางปุ่ม/label ได้เอง
        
        


        // กำหนด Layout Manager
        frame.setLayout(new java.awt.FlowLayout()); // Grid and Flow // Create LayOut
        frame.setLayout(null); // ปิด Layout ก่อน

        // button
        JButton btn = new JButton("Exit"); // Create new OBJ Button
        btn.setText("Strat"); // add new Text
        btn.setBounds(650, 200, 200, 80);
        JButton btn2 = new JButton("Exit"); // Create Button Exit
        btn2.setBounds(650, 600, 200, 80);
        JButton btn3 = new JButton("SETTING");
        frame.add(btn3);
        btn3.setBounds(650, 400, 200, 80);



        // Label
        JLabel lb = new JLabel();
        lb.setText("Test Gui and Learning Gui"); // setText Label
        lb.setBounds(650, 0, 300, 50); // x, y, width, height

        //add label
        frame.add(lb);
        frame.add(btn); // add Botton OBJ
        frame.add(btn2); // Add Botton OBJ Exit

        btn.addActionListener(new ActionListener() { //Click

        @Override 
            public void actionPerformed(ActionEvent e) {

        frame.getContentPane().removeAll(); // Delet Component all out frame\
        backgroundPanel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        frame.add(backgroundPanel); // add Background panel
        frame.revalidate();
        frame.repaint();

        JButton Botton = new JButton("NIGGER HOUSE");
        
        frame.add(Botton);
        Botton.setBounds(480, 710, 200, 30);
        backgroundPanel.add(Botton); // add Button on background
        
        //Create
        JButton Work = new JButton("Tech Crop(Working)");
        JButton Shop = new JButton("Shop");
        JButton School = new JButton("School");
        JButton FriendHouse = new JButton("Friend House");
        JButton reeturn = new JButton("Return");

        // add button work
        frame.add(Work);
        Work.setBounds(880, 480, 200, 30);
        backgroundPanel.add(Work);
        

        // add button shop 
        frame.add(Shop);
        Shop.setBounds(380, 510, 200, 30);
        backgroundPanel.add(Shop);

        // add button School 
        frame.add(School);
        School.setBounds(580, 310, 200, 30);
        backgroundPanel.add(School);

        // add button FriendHouse 
        frame.add(FriendHouse);
        FriendHouse.setBounds(700, 680, 200, 30);
        backgroundPanel.add(FriendHouse);

        //add button return 

        frame.add(reeturn);
        reeturn.setBounds(0, 0, 200, 30);
        backgroundPanel.add(reeturn);

        reeturn.addActionListener(new ActionListener() {
            
            @Override

            public void actionPerformed(ActionEvent e) {

                
                
            }

        });
        

        }
    });
        btn2.addActionListener(new ActionListener() {
            
            @Override 
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit Program when Click Exit
            }
        });


          JPanel backgroundPanel2 = new JPanel() {
        @Override

            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img2, 0, 0, getWidth(), getHeight(), this);
        }
    };

        JLabel imageLabel = new JLabel(new ImageIcon(img2));
        imageLabel.setBounds(0, 0, frame.getWidth() , frame.getHeight()); // ปรับตำแหน่งและขนาดตามต้องการ
        frame.add(imageLabel); // Add img2 in bell

    }
}