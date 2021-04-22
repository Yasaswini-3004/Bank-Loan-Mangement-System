//Java program for Bank Loan Management System
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
public class Bank_1 {

	private JFrame frameBankLoanManagement;
	private JTextField textField_Name;
	private JTextField textField_Age;
	private JTextField textField_Income;
	private JTextField textField_Loan;
	private JTextField textField_Term;
	private JTextField textField_Rate;
	double loan[]=new double[20];
	String Intrest;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank_1 window = new Bank_1();
					window.frameBankLoanManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bank_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameBankLoanManagement = new JFrame();
		frameBankLoanManagement.setBounds(200, 200, 1200, 550);
		frameBankLoanManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBankLoanManagement.getContentPane().setLayout(null);
		
		JLabel lbluserdetails = new JLabel("User details");
		lbluserdetails.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lbluserdetails.setBounds(185, 65, 139, 32);
		frameBankLoanManagement.getContentPane().add(lbluserdetails);
		
		JLabel lblBankLoanManagement = new JLabel("Bank Loan Management");
		lblBankLoanManagement.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblBankLoanManagement.setBounds(443, 10, 406, 32);
		frameBankLoanManagement.getContentPane().add(lblBankLoanManagement);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 52, 1166, 3);
		frameBankLoanManagement.getContentPane().add(separator_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblName.setBounds(30, 122, 122, 32);
		frameBankLoanManagement.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAge.setBounds(30, 176, 122, 32);
		frameBankLoanManagement.getContentPane().add(lblAge);
		
		JLabel lblIncome = new JLabel("Income");
		lblIncome.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblIncome.setBounds(30, 238, 122, 32);
		frameBankLoanManagement.getContentPane().add(lblIncome);
		
		JLabel lblLoan_Amount = new JLabel("Loan Amount");
		lblLoan_Amount.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLoan_Amount.setBounds(30, 300, 122, 32);
		frameBankLoanManagement.getContentPane().add(lblLoan_Amount);
		
		JLabel lblTerm = new JLabel("Term");
		lblTerm.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTerm.setBounds(30, 359, 122, 32);
		frameBankLoanManagement.getContentPane().add(lblTerm);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRate.setBounds(30, 421, 122, 32);
		frameBankLoanManagement.getContentPane().add(lblRate);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(263, 122, 175, 32);
		frameBankLoanManagement.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_Age = new JTextField();
		textField_Age.setColumns(10);
		textField_Age.setBounds(263, 176, 175, 32);
		frameBankLoanManagement.getContentPane().add(textField_Age);
		
		textField_Income = new JTextField();
		textField_Income.setColumns(10);
		textField_Income.setBounds(263, 238, 175, 32);
		frameBankLoanManagement.getContentPane().add(textField_Income);
		
		textField_Loan = new JTextField();
		textField_Loan.setColumns(10);
		textField_Loan.setBounds(263, 303, 175, 32);
		frameBankLoanManagement.getContentPane().add(textField_Loan);
		
		textField_Term = new JTextField();
		textField_Term.setColumns(10);
		textField_Term.setBounds(263, 362, 175, 32);
		frameBankLoanManagement.getContentPane().add(textField_Term);
		
		textField_Rate = new JTextField();
		textField_Rate.setColumns(10);
		textField_Rate.setBounds(263, 421, 175, 32);
		frameBankLoanManagement.getContentPane().add(textField_Rate);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(490, 116, 2, 337);
		frameBankLoanManagement.getContentPane().add(separator);
		
		JLabel lblLoanType = new JLabel("Loan Type");
		lblLoanType.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblLoanType.setBounds(529, 65, 139, 32);
		frameBankLoanManagement.getContentPane().add(lblLoanType);
		
		JRadioButton rdbtnEducation = new JRadioButton("Education Loan");
		rdbtnEducation.setFocusable(false);
		rdbtnEducation.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnEducation.setBounds(529, 122, 175, 32);
		frameBankLoanManagement.getContentPane().add(rdbtnEducation);
		
		JRadioButton rdbtnPersonalLoan = new JRadioButton("Personal Loan");
		rdbtnPersonalLoan.setFocusable(false);
		rdbtnPersonalLoan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnPersonalLoan.setBounds(529, 173, 175, 32);
		frameBankLoanManagement.getContentPane().add(rdbtnPersonalLoan);
		
		JRadioButton rdbtnCarLoan = new JRadioButton("Car Loan");
		rdbtnCarLoan.setFocusable(false);
		rdbtnCarLoan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnCarLoan.setBounds(529, 224, 175, 32);
		frameBankLoanManagement.getContentPane().add(rdbtnCarLoan);
		
		JRadioButton rdbtnHouseLoan = new JRadioButton("House Loan");
		rdbtnHouseLoan.setFocusable(false);
		rdbtnHouseLoan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnHouseLoan.setBounds(529, 273, 175, 32);
		frameBankLoanManagement.getContentPane().add(rdbtnHouseLoan);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(710, 116, 2, 337);
		frameBankLoanManagement.getContentPane().add(separator_2);
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textArea.setBounds(757, 122, 385, 331);
		frameBankLoanManagement.getContentPane().add(textArea);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=textField_Name.getText();
				loan[0]=Double.parseDouble(textField_Age.getText());
				loan[1]=Double.parseDouble(textField_Income.getText());
				loan[2]=Double.parseDouble(textField_Loan.getText());
				loan[3]=Double.parseDouble(textField_Rate.getText());
				loan[4]=Double.parseDouble(textField_Term.getText());
				double age=loan[0];
				double income=loan[1];
				textArea.append("Welcome to ABDC Bank\n");
				textArea.append("--------------------------------------------------------------------------\n");
				textArea.append("Name of the user : ");
				textArea.append(Name);
				textArea.append("\n");
				textArea.append("Monthly payement is: ");
				if(rdbtnEducation.isSelected()==true) {
				if(age>15&&income>=300000)
			    {
					loan[3] = loan[3] / (12*100);
	    	    	loan[4] = loan[4] *12;
	    	    	loan[5] = (loan[2] * loan[3] * Math.pow(1 + loan[3],loan[4]))/ (Math.pow(1 + loan[3],loan[4]) - 1);
	    	    	Intrest=String.format("%.2f", loan[5]);
	    	    	textArea.append(Intrest);
				}else {
					JOptionPane.showMessageDialog(null, "Age requirement not met","Loan Management", JOptionPane.OK_OPTION);
				}
				}
				else if(rdbtnPersonalLoan.isSelected()==true)
			    {
					loan[3] = loan[3] / (12*100);
	    	    	loan[4] = loan[4] *12;
	    	    	loan[5] = (loan[2] * loan[3] * Math.pow(1 + loan[3],loan[4]))/ (Math.pow(1 + loan[3],loan[4]) - 1);
	    	        Intrest=String.format("%.2f", loan[5]);
	    	        textArea.append(Intrest);
	    	    	
				}else if(rdbtnCarLoan.isSelected()==true)
			    {
					loan[3] = loan[3] / (12*100);
	    	    	loan[4] = loan[4] *12;
	    	    	loan[5] = (loan[2] * loan[3] * Math.pow(1 + loan[3],loan[4]))/ (Math.pow(1 + loan[3],loan[4]) - 1);
	    	        Intrest=String.format("%.2f", loan[5]);
	    	        textArea.append(Intrest);
	    	   
				}else if(rdbtnHouseLoan.isSelected()==true)
			    {
					loan[3] = loan[3] / (12*100);
	    	    	loan[4] = loan[4] *12;
	    	    	loan[5] = (loan[2] * loan[3] * Math.pow(1 + loan[3],loan[4]))/ (Math.pow(1 + loan[3],loan[4]) - 1);
	    	        Intrest=String.format("%.2f", loan[5]);
	    	        textArea.append(Intrest);
				}
				textArea.append("\n--------------------------------------------------------------------------");
				textArea.append("\n\nThankyou for visting our bank.");
				textArea.append("\n");
				textArea.append("\nFor further details contact ");
				textArea.append("\n96854 XXXXX");
				textArea.append("\nabcd@gmail.com");
			}
		});
		btnCalculate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCalculate.setBounds(529, 335, 139, 32);
		frameBankLoanManagement.getContentPane().add(btnCalculate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Name.setText(null);
				textField_Age.setText(null);
				textField_Income.setText(null);
				textField_Loan.setText(null);
				textField_Rate.setText(null);
				textField_Term.setText(null);
				rdbtnEducation.setSelected(false);
				rdbtnPersonalLoan.setSelected(false);
				rdbtnCarLoan.setSelected(false);
				rdbtnHouseLoan.setSelected(false);
				textArea.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(529, 377, 139, 32);
		frameBankLoanManagement.getContentPane().add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					   textArea.print();
					   textField_Name.setText(null);
						textField_Age.setText(null);
						textField_Income.setText(null);
						textField_Loan.setText(null);
						textField_Rate.setText(null);
						textField_Term.setText(null);
						rdbtnEducation.setSelected(false);
						rdbtnPersonalLoan.setSelected(false);
						rdbtnCarLoan.setSelected(false);
						rdbtnHouseLoan.setSelected(false);
						textArea.setText(null);
				   }
				   catch(java.awt.print.PrinterException e1){
					   System.err.format("No Printer Found", e1.getMessage());
					  btnPrint.setFocusable(false);
				   }
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPrint.setBounds(529, 421, 139, 32);
		frameBankLoanManagement.getContentPane().add(btnPrint);
	}
}