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
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ManagerDrugManagementPage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerDrugManagementPage frame = new ManagerDrugManagementPage();
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
	public ManagerDrugManagementPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1193, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnDefineADrug = new JRadioButton("define a drug");
		rdbtnDefineADrug.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnDefineADrug.setBounds(226, 55, 251, 41);
		contentPane.add(rdbtnDefineADrug);
		
		JRadioButton rdbtnWarehouseManagment = new JRadioButton("add drug to warehouse");
		rdbtnWarehouseManagment.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnWarehouseManagment.setBounds(226, 116, 348, 41);
		contentPane.add(rdbtnWarehouseManagment);
		
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnDefineADrug);
		group.add(rdbtnWarehouseManagment);
		
		JButton btnSelect = new JButton("select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnDefineADrug.isSelected()){
					//define a drug
					ManagerDefineDrug manager=new ManagerDefineDrug();
					manager.show();
					dispose();
					
				}else if(rdbtnWarehouseManagment.isSelected()){
					//add or delete a drug from warehouse
					
				}else{
					//choose an option
					JOptionPane.showMessageDialog(contentPane, "select an option please");
					
				}
				
				
			}
		});
		btnSelect.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		btnSelect.setBounds(357, 316, 171, 41);
		contentPane.add(btnSelect);
		
		JButton btnReturn = new JButton("return");
		btnReturn.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		btnReturn.setBounds(90, 316, 171, 41);
		contentPane.add(btnReturn);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"count", "drug name", "drug code"
			}
		));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		table.setBounds(721, 96, 368, 281);
		contentPane.add(table);
		
		JLabel lblCriticalDrugs = new JLabel(" critical drugs");
		lblCriticalDrugs.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblCriticalDrugs.setBounds(791, 35, 210, 33);
		contentPane.add(lblCriticalDrugs);
		
		JRadioButton rdbtnDeleteDrugFrom = new JRadioButton("delete drug from warehouse");
		rdbtnDeleteDrugFrom.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnDeleteDrugFrom.setBounds(226, 180, 408, 41);
		contentPane.add(rdbtnDeleteDrugFrom);
		
		JRadioButton rdbtnShowWarehouse = new JRadioButton("show warehouse");
		rdbtnShowWarehouse.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		rdbtnShowWarehouse.setBounds(226, 241, 251, 41);
		contentPane.add(rdbtnShowWarehouse);
	}
}
