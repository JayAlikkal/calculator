package NewPack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JEditorPane;

public class FirstApp {
	
	double firstnum;
	double secondnum;
	double result;
	String operators;
	String answer;

	private JFrame frame;
	private JTextField textField;
	private JTextField txtAnkitaCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstApp window = new FirstApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 305, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		

		textField = new JTextField();
		textField.setBounds(31, 82, 230, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		

		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton.setBounds(31, 136, 50, 43);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_2.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_2.setBounds(91, 136, 50, 43);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_3.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_3.setBounds(151, 136, 50, 43);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_3);
		
		
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_1.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_1.setBounds(31, 191, 50, 43);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_4.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_4.setBounds(91, 190, 50, 43);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_5.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_5.setBounds(151, 190, 50, 43);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_5);
		
		
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_6.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_6.setBounds(31, 245, 50, 43);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_7.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_7.setBounds(91, 244, 50, 43);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_8.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_8.setBounds(151, 244, 50, 43);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_8);
		

		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enter = textField.getText() + btnNewButton_9.getText();
				textField.setText(Enter);
			}
		});
		btnNewButton_9.setBounds(31, 299, 50, 43);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "+";
			}
		});
		btnNewButton_10.setBounds(91, 298, 50, 43);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "-";
			}
		});
		btnNewButton_11.setBounds(151, 298, 50, 43);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String answer;
			secondnum = Double.parseDouble(textField.getText());
			if(operators == "+") {
				result = firstnum + secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if (operators == "-"){
				result = firstnum - secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if (operators == "*") {
			    result = firstnum * secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer);
				
			}
				
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_12.setBounds(211, 298, 50, 43);
		frame.getContentPane().add(btnNewButton_12);
		
		txtAnkitaCalculator = new JTextField();
		txtAnkitaCalculator.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtAnkitaCalculator.setText(" java Calculator");
		txtAnkitaCalculator.setBounds(102, 33, 80, 20);
		frame.getContentPane().add(txtAnkitaCalculator);
		txtAnkitaCalculator.setColumns(10);
		
		JButton btnNewButton_13 = new JButton("C");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_13.setBounds(211, 136, 50, 43);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("<");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Back = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() -1);
					Back = str.toString();
					textField.setText(Back);
				}
			}
		});
		btnNewButton_14.setBounds(211, 193, 50, 43);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("*");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "*";
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_15.setBounds(211, 245, 50, 43);
		frame.getContentPane().add(btnNewButton_15);
		
	
		
		
		
		
		
		
		
		
	}
}
