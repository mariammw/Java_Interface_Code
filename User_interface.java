
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class User_interface extends JFrame implements ActionListener{
	Container c;
	static boolean flag = false;
	private JPanel panel;
	private JTextField txtName, textField22;
	private JPasswordField passwordField,textField_1;
	private JButton btnLogin = new JButton("LOGIN"),btnCustomers,btnNewButton2 ;
	private JButton btnDashboard,btnOrders,btnSettings,btnNewButton ;
	private JLabel lblWelcome = new JLabel("Welcome"), lblNewLabel,lblNewLabel1 ;
	private JLabel lblPassword = new JLabel("Password:");
	private JLabel lblNewLabel_1 = new JLabel("User Name:");
	private JList list_1;
	JTabbedPane tabbedPane;
	String avName[] = {"Mary","Mosa","Ali","Saher","Soha","ansam"};
	String avPass[] = {"1","werg432","fgd213","$@#$GD","1313","93424SR@#$"};
	String desc[][] = {{"Recieve 1000$","buying car 23$","get more 323$","upload 32$","invert 34$","recive 1323$ from other bank","take a loan ","buy banking service","paying 433$"}};
	int mon[] = {132,123,1423,231,345,1243};
	HashMap<String, String>Pass;
	HashMap<String,Integer>idx;
	JFrame firstForm ;
	String st1 ="null";
	DefaultListModel add = new DefaultListModel();
	
	
	public User_interface(){
		super("User_Interface");
		Pass = new HashMap<String,String>();
		idx = new HashMap<String,Integer>();
		for(int i = 0 ; i < 9 ; i++){
			add.addElement(desc[0][i]);
		}
		for(int i = 0 ; i < avName.length ; i++){
			Pass.put(avName[i], avPass[i]);
			idx.put(avName[i], i);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 490);
		c = getContentPane();
		c.setBackground(new Color(51, 51, 51));
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(395, 0, 430, 477);
		panel.setBackground(new Color(51, 51, 51));
		// 
		  lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 0, 405, 477);
		lblNewLabel.setIcon(new ImageIcon(User_interface.class.getResource("sky.png")));
		c.add(lblNewLabel);
		
		
		panel.setBounds(399, 0, 419, 461);
		panel.setBackground(new Color(51, 51, 51));
		c.add(panel);
		panel.setLayout(null);
		
		
		lblNewLabel_1.setForeground(new Color(0, 153, 153));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 115, 122, 64);
		panel.add(lblNewLabel_1);
		
		
		lblPassword.setForeground(new Color(0, 153, 153));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBackground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblPassword.setBounds(10, 190, 122, 64);
		panel.add(lblPassword);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(0, 51, 102));
		txtName.setText("name");
		txtName.setBounds(138, 120, 271, 47);
		txtName.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(txtName);
		txtName.setColumns(10);
		
		passwordField = new JPasswordField("enter here");
		passwordField.setBounds(138, 199, 271, 47);
		passwordField.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(passwordField);
		
		
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(102, 102, 153));
		btnLogin.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		btnLogin.setBounds(93, 296, 263, 71);
		btnLogin.addActionListener(this);
		panel.add(btnLogin);
		
		
		lblWelcome.setForeground(new Color(0, 153, 153));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		lblWelcome.setBounds(81, 38, 251, 47);
		panel.add(lblWelcome);
		c.add(panel);
		setVisible(true);
		//
		
		
		firstForm = new JFrame("Malve");
		firstForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		firstForm.setSize(800, 600);
		firstForm.setLocationRelativeTo(null);
		firstForm.setVisible(false);
		
		firstForm.setBounds(100, 100, 800, 467);
		
		firstForm.setBackground(Color.WHITE);
		firstForm.setLayout(null);

		
	//next Form
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 139, 139));
		panel_1.setBounds(0, 0, 60, 428);
		firstForm.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		 btnDashboard = new JButton("");
		btnDashboard.setToolTipText("adding new payment");
		btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		btnDashboard.setIcon(new ImageIcon(User_interface.class.getResource("analytics-graph-bar.png")));
		btnDashboard.setBackground(new Color(0, 128, 128));
		btnDashboard.addActionListener(this);
		btnDashboard.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel_1.add(btnDashboard);
		
		btnOrders = new JButton("");
		btnOrders.setToolTipText("print my information in text files");
		btnOrders.setHorizontalAlignment(SwingConstants.LEFT);
		btnOrders.setIcon(new ImageIcon(User_interface.class.getResource("print-text.png")));
		btnOrders.setBackground(new Color(0, 128, 128));
		btnOrders.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		btnOrders.addActionListener(this);
		panel_1.add(btnOrders);
		
		 btnSettings = new JButton("");
		btnSettings.setToolTipText("change my password");
		btnSettings.setHorizontalAlignment(SwingConstants.LEFT);
		btnSettings.setSelectedIcon(new ImageIcon(User_interface.class.getResource("screen-1.png")));
		btnSettings.setIcon(new ImageIcon(User_interface.class.getResource("hammer-1.png")));
		btnSettings.setBackground(new Color(0, 128, 128));
		btnSettings.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		btnSettings.addActionListener(this);
		panel_1.add(btnSettings);
		
		btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Log out");
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.addActionListener(this);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(User_interface.class.getResource("gauge-dashboard-1.png")));
		panel_1.add(btnNewButton);
		
		
		btnNewButton2 = new JButton("");
		btnNewButton2.setToolTipText("View my Total money");
		btnNewButton2.setBackground(new Color(0, 128, 128));
		btnNewButton2.addActionListener(this);
		btnNewButton2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton2.setIcon(new ImageIcon(User_interface.class.getResource("view.png")));
		panel_1.add(btnNewButton2);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(58, 0, 488, 428);
		firstForm.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBounds(10, 47, 153, 26);
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JLabel lblUserpassword = new JLabel("UserPassword:");
		lblUserpassword.setForeground(new Color(0, 128, 128));
		lblUserpassword.setBounds(10, 121, 153, 26);
		lblUserpassword.setFont(new Font("Sylfaen",Font.PLAIN, 18));
		panel.add(lblUserpassword);
		
		JLabel lblUserDescprtion = new JLabel("User Descprtion");
		lblUserDescprtion.setForeground(new Color(0, 128, 128));
		lblUserDescprtion.setBounds(10, 180, 153, 26);
		lblUserDescprtion.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(lblUserDescprtion);
		
		textField_1 = new JPasswordField(st1);
		textField_1.setForeground(new Color(0, 128, 128));
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Sylfaen",Font.PLAIN, 18));
		textField_1.setBounds(173, 108, 268, 39);
		panel.add(textField_1);
		list_1=new JList(add); 
		list_1.setBackground(new Color(51, 51, 51));
		list_1.setForeground(new Color(0, 128, 128));
		JScrollPane scp = new JScrollPane(list_1);
		panel.add(scp);
		scp.setBounds(20, 207, 416, 210);
		
		textField22 = new JTextField(st1);
		textField22.setForeground(new Color(0, 128, 128));
		textField22.setFont(new Font("Sylfaen",Font.PLAIN, 18));
		textField22.setEnabled(false);
		textField22.setColumns(10);
		textField22.setBounds(173, 41, 268, 39);
		panel.add(textField22);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(User_interface.class.getResource("auro.jpg")));
		label.setBounds(541, 0, 243, 428);
		firstForm.add(label);
		
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnLogin){
			st1 = txtName.getText();
			String str = txtName.getText();
			String str2 =String.valueOf( passwordField.getPassword());
			if(!Pass.containsKey(str)){
				JOptionPane.showMessageDialog(null, "There is no User name","Error", JOptionPane.WARNING_MESSAGE);
			}
			else if(!Pass.get(str).equals(str2)){
				JOptionPane.showMessageDialog(null, "Password wrong try again ","Password Error", JOptionPane.WARNING_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Welcome  "+str,"welcome ", JOptionPane.PLAIN_MESSAGE);
				st1 = str;
				textField22.setText(st1);
				textField_1.setText(Pass.get(st1));
				c.setVisible(false);
				this.setVisible(false);
				firstForm.setVisible(true);
				flag = true;
			}
			
			
		}
		if(e.getSource()==btnDashboard ){
			int value =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how much you want to pay ?"));
			if(value==0)
				JOptionPane.showMessageDialog(null, "wrong put number more than zero");
			else if(mon[idx.get(st1)] > value ){
				JOptionPane.showMessageDialog(null, "process succesd");
				String o = "pay  "+value+"$";
				add.addElement(o);	
				mon[idx.get(st1)] -= value;
			}
			else
				JOptionPane.showMessageDialog(null, "Currently money "+mon[idx.get(st1)]+" sorry you have less money");
			
		}
		if(e.getSource() == btnSettings ){
			String pas = (JOptionPane.showInputDialog(null, "Enter new Password"));
			Pass.put(st1, pas);
			JOptionPane.showMessageDialog(null, "process succesd" + Pass.get("Mary"));
			textField_1.setText(Pass.get(st1));
		}
		if(e.getSource() == btnOrders){
		BufferedWriter bw = null;
		File f = new File("D:\\test.txt");
		String s= null;
		try
		{
			if(!f.exists()) f.createNewFile();
			bw = new BufferedWriter(new FileWriter(f,true));
			//Writing 5 lines in test.txt
			bw.write("User name "+st1+" Password : "+Pass.get(st1)+" \nMoney : "+mon[idx.get(st1)]+" \nDescrption "+desc[0]);
			bw.close();
			System.out.println("Finished Writing");
		}
		catch (IOException e1)
		{
			System.out.println("Exception"+e1);
		}
		JOptionPane.showMessageDialog(null, "process succesd" );
		}
		if(e.getSource() == btnNewButton){
			firstForm.setVisible(false);
			this.setVisible(true);
			JOptionPane.showMessageDialog(null, "Logging out" );
			c.setVisible(true);
		}
		if(e.getSource() == btnNewButton2 ){
			JOptionPane.showMessageDialog(null, "Your Balance: "+mon[idx.get(st1)] );	
		}
	}
	public static void main(String arg[]){
		new User_interface();
		
		
	}
}
