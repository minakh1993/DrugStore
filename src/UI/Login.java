package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javaClasses.EntryManager;
import javaClasses.users;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		EntryManager entryManager=new EntryManager();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		txtUsername.setText("username");
		txtUsername.setBounds(303, 155, 236, 39);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsrname = new JLabel("usrname:");
		lblUsrname.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblUsrname.setBounds(109, 159, 168, 33);
		contentPane.add(lblUsrname);
		
		JLabel lblPassword = new JLabel("password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblPassword.setBounds(109, 236, 168, 33);
		contentPane.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		txtPassword.setText("password");
		txtPassword.setBounds(303, 232, 236, 39);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			users user=entryManager.LogInValidation(txtUsername.getText(), txtPassword.getText());
			if(user==null || user.getUsername()==null){
				//means this user doesn't exist
				
				JOptionPane.showMessageDialog(contentPane, "wrong username or password try again");
			}else{
				if(user.getAccessLevel()==1){
					//means this user is a manager
					ManagerOptionPage manager=new ManagerOptionPage();
					manager.show();
					dispose();
					
				}else if(user.getAccessLevel()==2){
					//means this user is an employee
					
				}else{
					//unspecified access level
					JOptionPane.showMessageDialog(contentPane, "unspecified access level");
					
				}
			}
				
				
				
			}
		});
		btnEnter.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		btnEnter.setBounds(506, 360, 171, 41);
		contentPane.add(btnEnter);
	}
}
