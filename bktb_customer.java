package hotel.management.system;
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import java.sql.*;	
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bktb_customer extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JLabel lblId;
	private JLabel lblNewLabel;
	private JLabel lblGender;
	private JTable table;
	private JLabel lblCountry;
	private JLabel lblRoom;
	private JLabel lblStatus;
	private JLabel lblNewLabel_1;
        private JLabel lb2food;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bktb_customer frame = new bktb_customer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		this.dispose();
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public bktb_customer() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(450, 510, 120, 30);
                btnExit.setBackground(Color.WHITE);
                btnExit.setForeground(Color.BLUE);
		contentPane.add(btnExit);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
                                    conn c  = new conn();
                                    
				String displayCustomersql = "select * from bktb_customer";
				ResultSet rs = c.s.executeQuery(displayCustomersql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				
			
		});
		btnLoadData.setBounds(300, 510, 120, 30);
                btnLoadData.setBackground(Color.WHITE);
                btnLoadData.setForeground(Color.BLUE);
		contentPane.add(btnLoadData);
		
		lblId = new JLabel("ID");
		lblId.setBounds(31, 11, 46, 14);
		contentPane.add(lblId);
                
                JLabel l1 = new JLabel("Number");
		l1.setBounds(120, 11, 46, 14);
		contentPane.add(l1);
		
		lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(229, 11, 65, 14);
		contentPane.add(lblNewLabel);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(320, 11, 46, 14);
		contentPane.add(lblGender);
		
		table = new JTable();
		table.setBounds(0, 40, 900, 450);
		contentPane.add(table);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(425, 11, 46, 14);
		contentPane.add(lblCountry);
		
		lblRoom = new JLabel("Room");
		lblRoom.setBounds(530, 11, 46, 14);
		contentPane.add(lblRoom);
                
                lb2food = new JLabel("Food ID");
		lb2food.setBounds(620, 11, 46, 14);
		contentPane.add(lb2food);
                
		lblStatus = new JLabel("Check-in Status");
		lblStatus.setBounds(700, 11, 100, 14);
		contentPane.add(lblStatus);
		
		lblNewLabel_1 = new JLabel("Total Paid");
		lblNewLabel_1.setBounds(818, 11, 100, 14);
		contentPane.add(lblNewLabel_1);
                
                getContentPane().setBackground(Color.CYAN);
	}
}