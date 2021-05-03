
package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class CustomerBill extends JFrame implements ActionListener{
    
    JLabel l1, l2;
    JTextArea t1;
    JButton b1;
    Choice c1;
    JPanel p1;
    String meter;
    
    CustomerBill(String meter){
        this.meter=meter;
        setSize(500,700);
        setLayout(new BorderLayout());
        
        p1 = new JPanel();
        
        l1 = new JLabel("Customer Number");
        
        l2 = new JLabel(meter);
        c1= new Choice();
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from customer where status='yes'");
            while(rs.next()){
                c1.add(rs.getString("number"));
            }
        }catch(Exception e){}
        c1.setBounds(271,274,150,20);
        add(c1);
        
        t1 = new JTextArea(50,15);
        
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));
        
        b1 = new JButton("Generate Bill");
        
        p1.add(l1);
        p1.add(l2);
        p1.add(c1);
        add(p1,"North");
        
        add(jsp,"Center");
        add(b1,"South");
        
        b1.addActionListener(this);
        
        setLocation(450,25);
          
    }
    public void actionPerformed(ActionEvent ae){
        try{
            String room_number="";
            String foodid="";
            int cost1=0;
            int cost2=0;
            int total=0;
            conn c=new conn();
            
            String number=c1.getSelectedItem();
            
            t1.setText("\tHOTEL TAJ\n\nCUSTOMER BILL FOR THE ID "+number+" , 2021 \n\n\n");
            
            ResultSet rs1=c.s.executeQuery("select * from customer where number= "+number);
            
            if(rs1.next()){
                t1.append("\n  Customer Name: "+rs1.getString("name"));
                t1.append("\n  Customer ID: "+rs1.getString("id"));
                t1.append("\n  Customer number: "+rs1.getString("number"));
                t1.append("\n  Customer Gender: "+rs1.getString("gender"));
                t1.append("\n  Customer Country: "+rs1.getString("country"));
                t1.append("\n----------------------------------------------------------------");
                t1.append("\n");
                room_number=rs1.getString("room_number");
                foodid=rs1.getString("foodid");
            }
            
            
            rs1=c.s.executeQuery("Select * from room where room_number= "+room_number);
            if(rs1.next()){
                t1.append("\n  Room Number: "+rs1.getString("room_number"));
                t1.append("\n  Room Type: "+rs1.getString("bed_type"));
                t1.append("\n  Room Cost: "+rs1.getString("price"));
                t1.append("\n------------------------------------------------------------------");
                t1.append("\n");
                cost1=Integer.parseInt(rs1.getString("price"));
            }
            
            rs1=c.s.executeQuery("select * from food where foodid= "+foodid);
            if(rs1.next()){
                t1.append("\n  Food ID: "+rs1.getString("foodid"));
                t1.append("\n  Food Name: "+rs1.getString("foodname"));
                t1.append("\n  Food Cost: "+rs1.getString("foodcost"));
                t1.append(("\n------------------------------------------------------------------"));
                t1.append("\n");
                cost2=Integer.parseInt(rs1.getString("foodcost"));
            }
            total=cost1+cost2;
            t1.append("\n    TOTAL PAYABLE :"+ total);
            t1.append("\n");
            t1.append(("------------------------------------------------------------------"));
            t1.append("\n");
            t1.append("THANKU, DO VISIT AGAIN");
            
                    
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args){
        new CustomerBill("").setVisible(true);
        
    }    
}
