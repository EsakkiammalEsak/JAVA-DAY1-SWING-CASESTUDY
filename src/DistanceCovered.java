package casestudy3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DistanceCovered {

	private JFrame frame;
	private JTextField DC;
	private JTextField D;
	private JTextField S;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistanceCovered window = new DistanceCovered();
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
	public DistanceCovered() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SOURCE LOCATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(107, 134, 194, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DESTINATION LOCATION");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(107, 206, 206, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DISTANCE CALCULATOR");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(250, 43, 324, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float c=(float) (57*2.3);
				DC.setText(c+" ");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(321, 260, 157, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("DISTANCE COVERED");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(107, 323, 177, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		DC = new JTextField();
		DC.setBounds(539, 332, 96, 19);
		frame.getContentPane().add(DC);
		DC.setColumns(10);
		
		D = new JTextField();
		D.setBounds(539, 217, 96, 19);
		frame.getContentPane().add(D);
		D.setColumns(10);
		
		S = new JTextField();
		S.setBounds(539, 128, 96, 19);
		frame.getContentPane().add(S);
		S.setColumns(10);
		frame.setBounds(100, 100, 782, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
