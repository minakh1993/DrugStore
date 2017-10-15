package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeOptionPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeOptionPage frame = new EmployeeOptionPage();
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
	public EmployeeOptionPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnSearchDrug = new JRadioButton("search drug");
		rdbtnSearchDrug.setBounds(40, 65, 182, 23);
		contentPane.add(rdbtnSearchDrug);
		
		JRadioButton rdbtnSubmitNewOrder = new JRadioButton("submit new order");
		rdbtnSubmitNewOrder.setBounds(40, 91, 171, 23);
		contentPane.add(rdbtnSubmitNewOrder);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnSearchDrug);
		btnGroup.add(rdbtnSubmitNewOrder);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnSearchDrug.isSelected()){
					JFrame search = new SearchDrug();
					search.setVisible(true);
					dispose();
				}
				else if(rdbtnSubmitNewOrder.isSelected()){
					JFrame submit = new SubmitOrder();
					submit.setVisible(true);
					dispose();
				}
			}
		});
		btnOk.setBounds(133, 154, 89, 23);
		contentPane.add(btnOk);
	}
}
