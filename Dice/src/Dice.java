import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class Dice 
{
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public Dice()
	{
		panel = new JPanel();
		button = new JButton("Roll");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Enter an integer greater than 0");
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText(); //Get sides input
				try
				{
					int side = Integer.parseInt(input);//convert String to int
					Random myRand = new Random();
					int roll = myRand.nextInt(side); //Roll random number from 0 to input-1
					String newText = "Roll is: " + (roll+1); //Add 1 to random number
					label.setText(newText);
					System.out.println(newText);
				}
				catch (Exception ex) //If bad input
				{
					String newText = "Enter an integer greater than 0";
					label.setText(newText);
					System.out.println(newText);
				}
			}
		};
		
		return listener;
	}	
}