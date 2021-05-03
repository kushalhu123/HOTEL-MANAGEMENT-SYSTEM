
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.sql.*;
import java.awt.event.*;

public class Food extends JFrame implements ActionListener{
    
    
    JTextField t1,t2;
    JButton b1,b2;
    JComboBox c1;
    
    Food(){
        JLabel title=new JLabel("FOOD");
        title.setBounds(125,18,150,30);
        title.setForeground(Color.DARK_GRAY);
        title.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(title);
        
        JLabel l2=new JLabel("Food ID");
        l2.setBounds(35,80,100,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l2);
        
        t1=new JTextField();
        t1.setBounds(150,80,100,20);
        add(t1);
        
        
        JLabel l3=new JLabel("Food Type");
        l3.setBounds(35,130,100,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l3);
        
        c1=new JComboBox(new String[]{"BreakFast","Lunch","Dinner","ChineseFoods","IceCream","Juices","Special Dish"});
        c1.setBounds(150,130,150,20);
        add(c1);
        
        
        
        
        JLabel l4=new JLabel("Food Cost");
        l4.setBounds(35,180,100,20);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l4);
        
        t2=new JTextField();
        t2.setBounds(150,180,100,20);
        add(t2);
        
        b1=new JButton("Submit");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLUE);
        b1.setBounds(35,250,120,25);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLUE);
        b2.setBounds(200,250,120,25);
        b2.addActionListener(this);
        add(b2);
        
        
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/foods.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
        ImageIcon i4=new ImageIcon(i3);
        JLabel l1=new JLabel(i4);
        l1.setBounds(400,20,500,400);
        add(l1);
        
        
        
        
        //getContentPane().setBackground(Color.CYAN);
        
        setLayout(null);
        setBounds(250,150,800,400);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()==b1){
            
            String ft=(String)c1.getSelectedItem();
            String s1 =  t1.getText();
            String s2 =  t2.getText();
        
            String str="insert into food values('"+s1+"','"+ft+"','"+s2+"')";
            try{
                conn c=new conn();
                c.s.executeUpdate(str);
            
                JOptionPane.showMessageDialog(null,"New Data Added");
       
                this.setVisible(false);
                
            }catch(Exception e){}
          
        }else if(ae.getSource()==b2){
            //new Dashboard().setVisible(true);
            this.setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Food().setVisible(true);
    }
    
    
}
