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
				String input = text.getText();
				int side = Integer.parseInt(input);//convert String to int
				Random myRand = new Random();
				int roll = myRand.nextInt(side);
				String newText = "Roll is: " + (roll+1);
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
}