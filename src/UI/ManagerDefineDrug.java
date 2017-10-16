package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javaClasses.Drug;
import javaClasses.EntryManager;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerDefineDrug extends JFrame {

	private JPanel contentPane;
	private JTextField txtDrugName;
	private JTextField txtDescription;

	public ManagerDefineDrug() {
		
		EntryManager entryManager=new EntryManager();
		
		
		setTitle("adding drug");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDrugName = new JTextField();
		txtDrugName.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		txtDrugName.setText("drug name");
		txtDrugName.setBounds(277, 110, 236, 39);
		contentPane.add(txtDrugName);
		txtDrugName.setColumns(10);
		
		txtDescription = new JTextField();
		txtDescription.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		txtDescription.setText("description");
		txtDescription.setBounds(277, 188, 236, 39);
		contentPane.add(txtDescription);
		txtDescription.setColumns(10);
		
		JLabel lblDrugName = new JLabel("drug name:");
		lblDrugName.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblDrugName.setBounds(93, 113, 158, 33);
		contentPane.add(lblDrugName);
		
		JLabel lblDesciption = new JLabel("desciption:");
		lblDesciption.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblDesciption.setBounds(93, 191, 158, 33);
		contentPane.add(lblDesciption);
		
		JButton btnAddDrug = new JButton("add drug");
		btnAddDrug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Drug drug=new Drug();
				drug.setName(txtDrugName.getText());
				boolean status=entryManager.addDrug(drug);
				if(status=true){
					JOptionPane.showMessageDialog(contentPane, "drug added successfully");
				}else{
					JOptionPane.showMessageDialog(contentPane, "operation failed");
				}
				
			}
		});
		btnAddDrug.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		btnAddDrug.setBounds(342, 288, 171, 41);
		contentPane.add(btnAddDrug);
	}
}
