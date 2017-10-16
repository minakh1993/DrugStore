package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerOptionPage extends JFrame {

	private JPanel contentPane;

	public ManagerOptionPage(String name) {
		setTitle("welcome"+" "+name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton rdbtnDrugStoreDrug = new JRadioButton("drug store drug list");
		rdbtnDrugStoreDrug.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnDrugStoreDrug.setBounds(130, 105, 303, 41);
		contentPane.add(rdbtnDrugStoreDrug);

		JRadioButton rdbtnBestSellsDrugs = new JRadioButton("best sells drugs in last month");
		rdbtnBestSellsDrugs.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnBestSellsDrugs.setBounds(130, 166, 412, 41);
		contentPane.add(rdbtnBestSellsDrugs);

		JRadioButton rdbtnEmployeeManager = new JRadioButton("Employee management");
		rdbtnEmployeeManager.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnEmployeeManager.setBounds(130, 227, 337, 41);
		contentPane.add(rdbtnEmployeeManager);

		JRadioButton rdbtnInsurranceManagement = new JRadioButton("Insurrance Management");
		rdbtnInsurranceManagement.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnInsurranceManagement.setBounds(130, 288, 351, 41);
		contentPane.add(rdbtnInsurranceManagement);

		JRadioButton rdbtnSalesReport = new JRadioButton("sales report");
		rdbtnSalesReport.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnSalesReport.setBounds(130, 349, 251, 41);
		contentPane.add(rdbtnSalesReport);

		// grouping the radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnDrugStoreDrug);
		group.add(rdbtnBestSellsDrugs);
		group.add(rdbtnEmployeeManager);
		group.add(rdbtnInsurranceManagement);
		group.add(rdbtnSalesReport);

		JButton btnSelect = new JButton("select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// setting the actions
				if (rdbtnDrugStoreDrug.isSelected()) {
					//going to drugs list 
					ManagerDrugManagementPage manager=new ManagerDrugManagementPage();
					manager.show();
					dispose();

				} else if (rdbtnBestSellsDrugs.isSelected()) {
					

				} else if (rdbtnEmployeeManager.isSelected()) {

				} else if (rdbtnInsurranceManagement.isSelected()) {

				} else if (rdbtnSalesReport.isSelected()) {

				} else {
					JOptionPane.showMessageDialog(contentPane, "select an option please");
				}

			}
		});
		btnSelect.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		btnSelect.setBounds(528, 404, 171, 41);
		contentPane.add(btnSelect);

	}
}
