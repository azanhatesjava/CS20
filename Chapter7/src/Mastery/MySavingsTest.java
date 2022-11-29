/*

Program: MySavingsTest.java          Last Date of this Revision: November 14, 2022

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class MySavingsTest {

	private JFrame frame;
	private JTextField withNum;
	private JTextField depNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavingsTest window = new MySavingsTest();
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
	public MySavingsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel baltot = new JLabel("");
		baltot.setFont(new Font("Monospaced", Font.BOLD, 8));
		baltot.setHorizontalAlignment(SwingConstants.CENTER);
		baltot.setBounds(0, 243, 674, 157);
		frame.getContentPane().add(baltot);
		
		JButton addPen = new JButton("Add Penny");
		addPen.setBounds(25, 80, 140, 59);
		frame.getContentPane().add(addPen);
		
		JButton addNick = new JButton("Add Nickel");
		addNick.setBounds(193, 80, 140, 59);
		frame.getContentPane().add(addNick);
		
		JButton addDime = new JButton("Add Dime");
		addDime.setBounds(357, 80, 140, 59);
		frame.getContentPane().add(addDime);
		
		JButton addQuart = new JButton("Add Quarter");
		addQuart.setBounds(520, 80, 140, 59);
		frame.getContentPane().add(addQuart);
		
		JLabel title = new JLabel("Your Bank Account");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Monospaced", Font.BOLD, 34));
		title.setBounds(0, 0, 674, 69);
		frame.getContentPane().add(title);
		
		JButton quit = new JButton("Quit");
		quit.setBounds(521, 173, 140, 59);
		frame.getContentPane().add(quit);
		
		JButton with = new JButton("Withdraw");
		with.setBounds(381, 173, 107, 59);
		frame.getContentPane().add(with);
		
		withNum = new JTextField();
		withNum.setFont(new Font("Yu Gothic Light", Font.PLAIN, 25));
		withNum.setBounds(275, 173, 107, 59);
		frame.getContentPane().add(withNum);
		withNum.setColumns(10);
		
		depNum = new JTextField();
		depNum.setFont(new Font("Yu Gothic Light", Font.PLAIN, 25));
		depNum.setColumns(10);
		depNum.setBounds(26, 173, 107, 59);
		frame.getContentPane().add(depNum);
		
		JButton dep = new JButton("Add Custom");
		dep.setBounds(131, 173, 107, 59);
		frame.getContentPane().add(dep);
		
		/*
		JButton withPen = new JButton("Withdraw Penny");
		withPen.setBounds(25, 164, 140, 59);
		frame.getContentPane().add(withPen);
		
		JButton withNick = new JButton("Withdraw Nickel");
		withNick.setBounds(193, 164, 140, 59);
		frame.getContentPane().add(withNick);
		
		JButton withDime = new JButton("Withdraw Dime");
		withDime.setBounds(357, 164, 140, 59);
		frame.getContentPane().add(withDime);
		
		JButton withQuart = new JButton("Withdraw Quarter");
		withQuart.setBounds(520, 164, 140, 59);
		frame.getContentPane().add(withQuart);
		*/
		
		
		
		
		MySavings bank = new MySavings();
		
		
		addPen.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.addCoins(0.01);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		addNick.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.addCoins(0.05);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		addDime.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.addCoins(0.1);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		addQuart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.addCoins(0.25);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		
		
		
		
		with.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				String with = withNum.getText();
				bank.withCoins(Double.parseDouble(with));
				
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		dep.addActionListener(new ActionListener()
		{
			 
			public void actionPerformed(ActionEvent e)
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				String dep = depNum.getText();
				bank.addCoins(Double.parseDouble(dep));
				
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		
		
		
		quit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
		
		
		/*
		withPen.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.WithCoins(0.01);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		withNick.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.WithCoins(0.05);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		withDime.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.WithCoins(0.1);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		
		withQuart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberFormat dF = NumberFormat.getCurrencyInstance();
				
				bank.WithCoins(0.25);
				baltot.setText(dF.format(bank.getBal()));
			}
		});
		*/
	}
}
