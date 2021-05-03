package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel AirlineManagementSystem = new JLabel("HOTEL TAJ WELCOMES YOU");
	AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 35));
	AirlineManagementSystem.setBounds(450, 60, 1000, 85);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
        AirlineSystem.setForeground(Color.RED);
        //AirlineSystem.setFont(new Font("monospaced",Font.PLAIN,12));
        //AirlineSystem.setBackground(Color.WHITE);
	menuBar.add(AirlineSystem);
        

        

       
        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
        FlightDetails.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        FlightDetails.setIcon(new ImageIcon(image1));
        FlightDetails.setMnemonic('D');
        FlightDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        FlightDetails.setBackground(Color.WHITE);
        
	AirlineSystem.add(FlightDetails);
        
        JMenuItem bktb_customer = new JMenuItem("BKTB_CUSTOMER");
        bktb_customer.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon15 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon6.png"));
        Image image15 = icon15.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        bktb_customer.setIcon(new ImageIcon(image15));
        bktb_customer.setMnemonic('B');
        bktb_customer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        bktb_customer.setBackground(Color.WHITE);
        
	AirlineSystem.add(bktb_customer);
        
        bktb_customer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new bktb_customer().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
		
	JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.ORANGE);
	menuBar.add(AirlineSystemHello);
        
        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
        FlightDetailshello1.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon6.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        FlightDetailshello1.setIcon(new ImageIcon(image2));
        FlightDetailshello1.setMnemonic('E');
        FlightDetailshello1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        FlightDetailshello1.setBackground(Color.WHITE);
        
	AirlineSystemHello.add(FlightDetailshello1);
        
        FlightDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
        FlightDetailshello2.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon7.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        FlightDetailshello2.setIcon(new ImageIcon(image3));
        FlightDetailshello2.setMnemonic('R');
        FlightDetailshello2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        FlightDetailshello2.setBackground(Color.WHITE);
	AirlineSystemHello.add(FlightDetailshello2);
        
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
        
        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
        FlightDetailshello3.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon7.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        FlightDetailshello3.setIcon(new ImageIcon(image4));
        FlightDetailshello3.setMnemonic('O');
        FlightDetailshello3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        FlightDetailshello3.setBackground(Color.WHITE);
	AirlineSystemHello.add(FlightDetailshello3);
        
        JMenuItem m5=new JMenuItem("FOOD");
        
        m5.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon1.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m5.setIcon(new ImageIcon(image5));
        m5.setMnemonic('F');
        m5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        m5.setBackground(Color.WHITE);
        AirlineSystemHello.add(m5);
        
        m5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Food().setVisible(true);
                }catch(Exception e){}
            }
        });
        
        
        JMenu j3= new JMenu("MORE OPTIONS");
        j3.setForeground(Color.BLUE);
	menuBar.add(j3);
        
        JMenuItem m9=new JMenuItem("CALCULATOR");
        m9.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m9.setIcon(new ImageIcon(image9));
        m9.setMnemonic('V');
        m9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        m9.setBackground(Color.WHITE);
        
        j3.add(m9);
        
        m9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                    //setVisible(false);
                    
                }catch(Exception e){}
            }
        });
        
        JMenuItem m10=new JMenuItem("WEB BROWSER");
        m10.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon10.png"));
        Image image10 = icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m10.setIcon(new ImageIcon(image10));
        m10.setMnemonic('W');
        m10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        m10.setBackground(Color.WHITE);
        
        j3.add(m10);
        
        m10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    //new Login().setVisible(true);
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                    //setVisible(false);
                    
                }catch(Exception e){}
            }
        });
        
        JMenuItem m12=new JMenuItem("NOTEPAD");
        m12.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon12.png"));
        Image image11 = icon12.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m12.setIcon(new ImageIcon(image11));
        m12.setMnemonic('N');
        m12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        m12.setBackground(Color.WHITE);
        
        j3.add(m12);
        
        m12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    //new Login().setVisible(true);
                    Runtime.getRuntime().exec("notepad.exe");
                    //setVisible(false);
                    
                }catch(Exception e){}
            }
        });
        
        
        
        
        
        
        JMenuItem m4=new JMenuItem("LOGOUT");
        m4.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/login.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m4.setIcon(new ImageIcon(image6));
        m4.setMnemonic('L');
        m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        m4.setBackground(Color.WHITE);
        
        j3.add(m4);
        
        m4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Login().setVisible(true);
                    setVisible(false);
                    
                }catch(Exception e){}
            }
        });
        
        
        JMenuItem m7 = new JMenuItem("EXIT");
        m7.setFont(new Font("monospaced",Font.BOLD,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/icon11.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m7.setIcon(new ImageIcon(image8));
        m7.setMnemonic('C');
        m7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        m7.setBackground(Color.WHITE);
	j3.add(m7);
        
        
	m7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    System.exit(0);
                    
                }catch(Exception e ){}
            }
	});
        
        FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}