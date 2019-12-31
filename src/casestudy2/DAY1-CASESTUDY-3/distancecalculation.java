package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class distancecalculation {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distancecalculation window = new distancecalculation();
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
	public distancecalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 904, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		T1 = new JTextField();
		T1.setBounds(592, 107, 96, 19);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(592, 204, 96, 19);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("SPEED");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(156, 110, 85, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(154, 207, 74, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CALCULATOR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c=Double.parseDouble(T1.getText())*Double.parseDouble(T2.getText());
				T3.setText(c+" ");
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(343, 256, 160, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("DISTANCE");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(156, 338, 96, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		T3 = new JTextField();
		T3.setBounds(592, 335, 96, 19);
		frame.getContentPane().add(T3);
		T3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DISTANCE CALCULATION");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(324, 43, 364, 13);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
