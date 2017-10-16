package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javaClasses.Drug;
import javaClasses.EntryManager;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ManagerAddDrugToWarehouse extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTable table;
	private JLabel lblDrugName;
	private JTextField txtDrugName;
	private JLabel lblDrugExpireDate;
	private JLabel lblYear;
	private JLabel lblMonth;
	private JLabel lblDay;
	private JTextField txtCount;
	private JTextField txtPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerAddDrugToWarehouse frame = new ManagerAddDrugToWarehouse();
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
	public ManagerAddDrugToWarehouse() {
		
		EntryManager entryManager=new EntryManager();
		
		setTitle("add drug to warehouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		txtSearch.setText("search");
		txtSearch.setBounds(488, 95, 236, 39);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//searching the drug
				List<Drug> drugs=entryManager.searchDrug(txtSearch.getText());
				//adding to table
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);

				System.out.println(drugs.size());
				for (int i = 0; i < drugs.size(); i++) {
					System.out.println(drugs.get(i));

					model.insertRow(i, new Object[] { drugs.get(i).getCode(), drugs.get(i).getName() });

				}
				
			}
		});
		btnSearch.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		btnSearch.setBounds(750, 93, 171, 41);
		contentPane.add(btnSearch);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "drug code", "drug name" }));
		//table.setBounds(498, 189, 422, 367);
		
		JScrollPane scroll = new JScrollPane(table);
		// scroll.add(table);
		scroll.setBounds(498, 189, 422, 367);
		contentPane.add(scroll);
		
		lblDrugName = new JLabel("drug name:");
		lblDrugName.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblDrugName.setBounds(95, 99, 171, 33);
		contentPane.add(lblDrugName);
		
		txtDrugName = new JTextField();
		txtDrugName.setText("drug Name");
		txtDrugName.setBounds(95, 156, 236, 39);
		contentPane.add(txtDrugName);
		txtDrugName.setColumns(10);
		
		lblDrugExpireDate = new JLabel("drug Expire Date:");
		lblDrugExpireDate.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblDrugExpireDate.setBounds(95, 223, 227, 33);
		contentPane.add(lblDrugExpireDate);
		
		lblYear = new JLabel("year");
		lblYear.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblYear.setBounds(95, 271, 51, 33);
		contentPane.add(lblYear);
		
		lblMonth = new JLabel("month");
		lblMonth.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblMonth.setBounds(172, 271, 77, 33);
		contentPane.add(lblMonth);
		
		lblDay = new JLabel("day");
		lblDay.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDay.setBounds(269, 271, 51, 33);
		contentPane.add(lblDay);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1394", "1395", "1396", "1397", "1398", "1399"}));
		comboBox.setBounds(83, 323, 69, 39);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(182, 323, 67, 39);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox_2.setBounds(269, 323, 62, 39);
		contentPane.add(comboBox_2);
		
		txtCount = new JTextField();
		txtCount.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		txtCount.setText("count");
		txtCount.setBounds(192, 389, 139, 39);
		contentPane.add(txtCount);
		txtCount.setColumns(10);
		
		JLabel lblCount = new JLabel("count:");
		lblCount.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblCount.setBounds(83, 393, 83, 33);
		contentPane.add(lblCount);
		
		JLabel lblPrice = new JLabel("price:");
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblPrice.setBounds(83, 454, 83, 33);
		contentPane.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		txtPrice.setText("price");
		txtPrice.setBounds(188, 451, 143, 39);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		JButton btnInsert = new JButton("insert");
		btnInsert.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		btnInsert.setBounds(95, 528, 171, 41);
		contentPane.add(btnInsert);
	}
}
