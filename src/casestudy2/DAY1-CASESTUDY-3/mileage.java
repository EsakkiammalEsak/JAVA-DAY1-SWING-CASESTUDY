package CASESTUDY4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mileage {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mileage window = new mileage();
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
	public mileage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 896, 710);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MILEAGE CALCULATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(264, 61, 271, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DISTANCE COVERED IN KM");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(111, 195, 238, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PETROL CONSUMED IN LITRE");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(111, 273, 238, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
				t3.setText(c+" ");
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(341, 369, 143, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("MILEAGE IN LITRE");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(111, 504, 197, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(594, 192, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(594, 270, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(594, 501, 96, 19);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("km");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(757, 196, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("litre");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(767, 274, 45, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("litre");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(757, 505, 55, 13);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
