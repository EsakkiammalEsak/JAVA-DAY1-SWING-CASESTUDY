package casestudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class application {

	private JFrame frame;
	private JTextField f1;
	private JTextField l1;
	private JTextField dob;
	private JTextField mob;
	private JTextField e;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application window = new application();
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
	public application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 737, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLICATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(257, 42, 266, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(184, 103, 78, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(184, 145, 78, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(184, 186, 96, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(184, 232, 96, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(184, 275, 85, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		f1 = new JTextField();
		f1.setBounds(329, 100, 96, 19);
		frame.getContentPane().add(f1);
		f1.setColumns(10);
		
		l1 = new JTextField();
		l1.setBounds(329, 142, 96, 19);
		frame.getContentPane().add(l1);
		l1.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(329, 183, 96, 19);
		frame.getContentPane().add(dob);
		dob.setColumns(10);
		
		mob = new JTextField();
		mob.setBounds(329, 229, 96, 19);
		frame.getContentPane().add(mob);
		mob.setColumns(10);
		
		JRadioButton rbt = new JRadioButton("M");
		rbt.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonGroup.add(rbt);
		rbt.setBounds(332, 271, 45, 21);
		frame.getContentPane().add(rbt);
		
		JRadioButton rbt1 = new JRadioButton("F");
		rbt1.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonGroup.add(rbt1);
		rbt1.setBounds(392, 273, 103, 21);
		frame.getContentPane().add(rbt1);
		
		e = new JTextField();
		e.setBounds(329, 319, 96, 19);
		frame.getContentPane().add(e);
		e.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(184, 322, 78, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(81, 348, 632, 66);
		frame.getContentPane().add(ta);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gen;
				if(rbt.isSelected())
				{
					gen="male";
				}
				else
				{
					gen="female";
				}
				ta.setText("FIRST NAME\t"+f1.getText()+"LAST NAME\t"+l1.getText()+"DOB\t"+dob.getText()+"MOBILE NO"+mob.getText()+"GENDER"+gen);
			JOptionPane.showMessageDialog(frame, "DETAILS ADDED SUCCESSFULLY");
			
			}
		});
		btnNewButton.setBounds(537, 204, 103, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
