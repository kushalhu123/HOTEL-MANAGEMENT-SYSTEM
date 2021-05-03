
package hotel.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;

public class FoodInfo extends JFrame implements ActionListener{
    JTable t1;
    JButton b1,b2;
    
    FoodInfo(){
        
        t1=new JTable();
        t1.setBounds(0,40,800,500);
        add(t1);
        
        JLabel l1=new JLabel("Food ID");
        l1.setBounds(85,10,70,20);
        add(l1);
        
        JLabel l2=new JLabel("Food Type");
        l2.setBounds(355,10,70,20);
        add(l2);
        
        JLabel l3=new JLabel("Food Cost");
        l3.setBounds(600,10,70,20);
        add(l3);
        
        
        
        b1=new JButton("Load Data");
        b1.setBounds(225,560,120,30);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLUE);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(450,560,120,30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLUE);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.CYAN);
        
        
        setLayout(null);
        setBounds(300,50,800,650);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                conn c=new conn();
                String str="select * from food";
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            }catch(Exception e){}
            
        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
            
        }
        
    }
    
    public static void main(String[] args){
        new FoodInfo().setVisible(true);
        
    }
    
      
}
