package com.taps.math;

/**
 * Hello world!
 *
 */

import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
	JPanel myPanel = new JPanel();
	JFrame myFrame = new JFrame("Adder");
	myFrame.setLayout(new BorderLayout(3, 2));
	myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	myFrame.setSize(250, 100);

	final JTextField xField = new JTextField(5);
	final JTextField yField = new JTextField(5);
	JLabel z = new JLabel("z: ");
	final JLabel z_result = new JLabel("tt");
	JButton myButton = new JButton("Calculate");

	myButton.addActionListener(new ActionListener() {
		@Override 
		public void actionPerformed(ActionEvent arg0) {
			z_result.setText(xField.getText() + " " + yField.getText());
		}
	});

    	myFrame.add(new JLabel("x: "));
	myFrame.add(xField);
	// myFrame.add(Box.createHorizontalStrut(15));	
    	myFrame.add(new JLabel("y: "));	
	myFrame.add(yField);	
	myFrame.add(new JLabel("z: "));
	myFrame.add(z_result);
	// myFrame.add(myButton);
	myFrame.setVisible(true);
        
	int num1, num2;
	
	// String str1 = JOptionPane.showInputDialog("Enter first number: ");
	num1 = Integer.parseInt("90");
	// String str2 = JOptionPane.showInputDialog("Enter second number: ");
	num2 = Integer.parseInt("76");

	String result = String.format("\nIf x = %d and y = %d, then adder ( x, y ) = %d\n\n", num1, num2, App.adder( num1, num2));
	// JOptionPane.showMessageDialog(null, result);

	// myPanel.add(new JLabel(result));

	// int fin = JOptionPane.showConfirmDialog(null, myPanel,
        // "Adder ( X, Y )", JOptionPane.OK_CANCEL_OPTION);

    }

    public static int adder(int x, int y)
    {
	return x + y;
    }
}
