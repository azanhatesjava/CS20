/*

Program: Spending.java          Last Date of this Revision: September 28,2022

Purpose: Create a Spending application to help examine the spending patterns of a user.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class Spending 
{

	private JFrame frame;
	private JTextField foodI;
	private JTextField clothI;
	private JTextField entI;
	private JTextField rentI;
	private JLabel $4;
	private JLabel $3;
	private JLabel $2;
	private JLabel $1;
	private JButton reset;
	private JLabel categoryR;
	private JLabel budgetR;
	private JLabel foodR;
	private JTextField foodO;
	private JLabel clothR;
	private JLabel entR;
	private JLabel rentR;
	private JTextField clothO;
	private JTextField entO;
	private JTextField rentO;
	private JLabel $4_1;
	private JLabel $4_2;
	private JLabel $4_3;
	private JLabel $4_4;

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
					Spending window = new Spending();
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
	public Spending() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		NumberFormat pF = NumberFormat.getPercentInstance(); // formats numbers for percent
		
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		foodI = new JTextField();
		foodI.setBounds(230, 54, 86, 20);
		frame.getContentPane().add(foodI);
		foodI.setColumns(10);
		
		JLabel title = new JLabel("Enter the amount spent last month on the following items:");
		title.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		title.setBounds(86, 10, 471, 20);
		frame.getContentPane().add(title);
		
		JLabel foodP = new JLabel("Food:");
		foodP.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		foodP.setBounds(70, 54, 58, 21);
		frame.getContentPane().add(foodP);
		
		JLabel clothP = new JLabel("Clothing: ");
		clothP.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		clothP.setBounds(70, 94, 95, 21);
		frame.getContentPane().add(clothP);
		
		clothI = new JTextField();
		clothI.setColumns(10);
		clothI.setBounds(230, 94, 86, 20);
		frame.getContentPane().add(clothI);
		
		JLabel entP = new JLabel("Entertainment:");
		entP.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		entP.setBounds(70, 137, 116, 20);
		frame.getContentPane().add(entP);
		
		entI = new JTextField();
		entI.setColumns(10);
		entI.setBounds(230, 137, 86, 20);
		frame.getContentPane().add(entI);
		
		JLabel rentP = new JLabel("Rent:");
		rentP.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		rentP.setBounds(70, 178, 58, 20);
		frame.getContentPane().add(rentP);
		
		rentI = new JTextField();
		rentI.setColumns(10);
		rentI.setBounds(230, 178, 86, 20);
		frame.getContentPane().add(rentI);
		
		$4 = new JLabel("$");
		$4.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$4.setBounds(215, 177, 19, 20);
		frame.getContentPane().add($4);
		
		$3 = new JLabel("$");
		$3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$3.setBounds(215, 137, 19, 20);
		frame.getContentPane().add($3);
		
		$2 = new JLabel("$");
		$2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$2.setBounds(215, 93, 19, 20);
		frame.getContentPane().add($2);
		
		$1 = new JLabel("$");
		$1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$1.setBounds(215, 53, 19, 20);
		frame.getContentPane().add($1);
		
		JButton confirm = new JButton("CONFIRM");
		confirm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				float food = Float.parseFloat(foodI.getText()); // gets value of food
				float cloth = Float.parseFloat(clothI.getText()); // gets value of clothing
				float ent = Float.parseFloat(entI.getText()); // gets value of entertainment
				float rent = Float.parseFloat(rentI.getText()); // gets value of rent
				
				float foodP = (food/(food+cloth+ent+rent)); // gets value of foodP
				float clothP = (cloth/(food+cloth+ent+rent)); // gets value of clothP
				float entP = (ent/(food+cloth+ent+rent)); // gets value of entP
				float rentP = (rent/(food+cloth+ent+rent)); // gets value of rentP
				
				foodO.setText(String.valueOf(pF.format(foodP))); // sets value of food
				clothO.setText(String.valueOf(pF.format(clothP))); // sets value of food
				entO.setText(String.valueOf(pF.format(entP))); // sets value of food
				rentO.setText(String.valueOf(pF.format(rentP))); // sets value of food
				
			}
		});
		confirm.setBounds(469, 80, 100, 100);
		frame.getContentPane().add(confirm);
		
		reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				foodI.setText(""); // clears value of foodI
				clothI.setText(""); // clears value of clothI
				entI.setText(""); // clears value of entI
				rentI.setText(""); // clears value of rentI
				
				foodO.setText(""); // clears value of foodO
				clothO.setText(""); // clears value of clothO
				entO.setText(""); // clears value of entO
				rentO.setText(""); // clears value of rentO
			}
		});
		reset.setBounds(348, 80, 100, 100);
		frame.getContentPane().add(reset);
		
		categoryR = new JLabel("Category");
		categoryR.setHorizontalAlignment(SwingConstants.LEFT);
		categoryR.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		categoryR.setBounds(68, 250, 86, 23);
		frame.getContentPane().add(categoryR);
		
		budgetR = new JLabel("Budget");
		budgetR.setHorizontalAlignment(SwingConstants.LEFT);
		budgetR.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		budgetR.setBounds(240, 250, 86, 23);
		frame.getContentPane().add(budgetR);
		
		foodR = new JLabel("Food");
		foodR.setHorizontalAlignment(SwingConstants.LEFT);
		foodR.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		foodR.setBounds(70, 290, 86, 23);
		frame.getContentPane().add(foodR);
		
		foodO = new JTextField();
		foodO.setColumns(10);
		foodO.setBounds(230, 290, 86, 20);
		frame.getContentPane().add(foodO);
		
		clothR = new JLabel("Clothing");
		clothR.setHorizontalAlignment(SwingConstants.LEFT);
		clothR.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		clothR.setBounds(70, 333, 86, 23);
		frame.getContentPane().add(clothR);
		
		entR = new JLabel("Entertainment");
		entR.setHorizontalAlignment(SwingConstants.LEFT);
		entR.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		entR.setBounds(70, 372, 120, 23);
		frame.getContentPane().add(entR);
		
		rentR = new JLabel("Rent");
		rentR.setHorizontalAlignment(SwingConstants.LEFT);
		rentR.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		rentR.setBounds(70, 413, 86, 23);
		frame.getContentPane().add(rentR);
		
		clothO = new JTextField();
		clothO.setColumns(10);
		clothO.setBounds(230, 334, 86, 20);
		frame.getContentPane().add(clothO);
		
		entO = new JTextField();
		entO.setColumns(10);
		entO.setBounds(230, 372, 86, 20);
		frame.getContentPane().add(entO);
		
		rentO = new JTextField();
		rentO.setColumns(10);
		rentO.setBounds(230, 413, 86, 20);
		frame.getContentPane().add(rentO);
		
		$4_1 = new JLabel("$");
		$4_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$4_1.setBounds(203, 413, 19, 20);
		frame.getContentPane().add($4_1);
		
		$4_2 = new JLabel("$");
		$4_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$4_2.setBounds(203, 372, 19, 20);
		frame.getContentPane().add($4_2);
		
		$4_3 = new JLabel("$");
		$4_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$4_3.setBounds(203, 333, 19, 20);
		frame.getContentPane().add($4_3);
		
		$4_4 = new JLabel("$");
		$4_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		$4_4.setBounds(203, 290, 19, 20);
		frame.getContentPane().add($4_4);
	}
}
