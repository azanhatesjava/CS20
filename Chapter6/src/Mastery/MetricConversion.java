package Mastery;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class MetricConversion 
{

	private JFrame frame;
	private JTextField disT;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
{
				try 
				{
					MetricConversion window = new MetricConversion();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConversion() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		disT = new JTextField();
		disT.setBounds(132, 47, 283, 32);
		panel.add(disT);
		disT.setColumns(10);
		
		JLabel display = new JLabel("");
		display.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setBounds(132, 272, 277, 51);
		panel.add(display);
		
		JRadioButton inCm = new JRadioButton("Inches to cm");
		inCm.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonGroup.add(inCm);
		inCm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				DecimalFormat dF = new DecimalFormat("#0.0");
				
				String userinput = disT.getText();
				double usernum = Double.parseDouble(userinput);
				double answer;
				
				if(inCm.isSelected())
				{
					answer = usernum*2.54;
					display.setText(dF.format(answer) + "cm");
				}
			}
		});
		inCm.setBounds(199, 78, 151, 77);
		panel.add(inCm);
		
		JRadioButton ftCm = new JRadioButton("Feet to cm");
		ftCm.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonGroup.add(ftCm);
		ftCm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				DecimalFormat dF = new DecimalFormat("#0.0");
				
				String userinput = disT.getText();
				double usernum = Double.parseDouble(userinput);
				double answer;
				
				if(ftCm.isSelected())
				{
					answer = usernum*30.48;
					display.setText(dF.format(answer) + "cm");
				}
			}
		});
		ftCm.setBounds(199, 140, 151, 51);
		panel.add(ftCm);
		
		JRadioButton ydCm = new JRadioButton("Yards to cm");
		ydCm.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonGroup.add(ydCm);
		ydCm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				DecimalFormat dF = new DecimalFormat("#0.0");
				
				String userinput = disT.getText();
				double usernum = Double.parseDouble(userinput);
				double answer;
				
				if(ydCm.isSelected())
				{
					answer = usernum*91.44;
					display.setText(dF.format(answer) + "cm");
				}
			}
		});
		ydCm.setBounds(199, 194, 151, 51);
		panel.add(ydCm);
	}
}
