
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
            
		
                //setSize(1365,500);
                // setContentPane(300,300,1366,390);   frame size
                setBounds(3,50,1366,666);
                setLayout(null);
                //Super("Hotel Management System");
               //setLocation(10,100);

		//l1 = new JLabel("");
                
                ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon2.png"));
                Image i2 = ic1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
                b1 = new JButton("Next",new ImageIcon(i2));
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/starting.jpg"));
                //Image i3 = i1.getImage().getScaledInstance(1365,565,Image.SCALE_DEFAULT);
                //ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i1);
                l1.setBounds(0,0,1365,666);
                add(l1);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(20,450,1000,70);
                lid.setForeground(Color.WHITE);
                lid.setFont(new Font("serif",Font.PLAIN,50));

                l1.add(lid);
                
                b1.setBounds(1170,475,150,50);
		//l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		//add(l1);
 
                b1.addActionListener(this);
                //setVisible(true);
                
       
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}
