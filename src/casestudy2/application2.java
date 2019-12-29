package casestudy2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class application2 {

	private JFrame frame;
	private JTextField P;
	private JTextField D;
	private JTextField N;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application2 window = new application2();
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
	public application2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 863, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRINCIPLE AMOUNT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(99, 112, 192, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DISCOUNT");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(99, 196, 192, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NET PRICE");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(99, 306, 216, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		P = new JTextField();
		P.setBounds(578, 119, 96, 19);
		frame.getContentPane().add(P);
		P.setColumns(10);
		
		D = new JTextField();
		D.setBounds(578, 194, 96, 19);
		frame.getContentPane().add(D);
		D.setColumns(10);
		
		N = new JTextField();
		N.setBounds(578, 298, 96, 19);
		frame.getContentPane().add(N);
		N.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DISCOUNT CALCULATIONS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(274, 29, 255, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton BTN = new JButton("SUBMIT");
		BTN.setFont(new Font("Times New Roman", Font.BOLD, 16));
		BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p1=Integer.parseInt(P.getText());
				int p2=Integer.parseInt(D.getText());
				int ans,res;
				ans=(p1*p2)/100;
				res=p1-ans;
				N.setText(Integer.toString(res));
				
						}
		});
		BTN.setBounds(363, 257, 134, 21);
		frame.getContentPane().add(BTN);
	}
}
