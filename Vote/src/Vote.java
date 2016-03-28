import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class Vote 
{
	private JPanel panel;
	private JButton button;
	private JTextField fname;
	private JTextField lname;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JRadioButton clinton;
	private JRadioButton trump;
	private JRadioButton sanders;
	private JRadioButton cruz;
	private ButtonGroup group;
	
	public Vote()
	{
		panel = new JPanel();
		button = new JButton("Submit");
		fname = new JTextField(10);
		lname = new JTextField(10);
		label1 = new JLabel("First name:");
		label2 = new JLabel("Last name:");
		label3 = new JLabel("Please choose a candidate:");
		clinton = new JRadioButton("Hillary Clinton");
		trump = new JRadioButton("Donald Trump");
		sanders = new JRadioButton("Bernie Sanders");
		cruz = new JRadioButton("Ted Cruz");
		group = new ButtonGroup();
		
		//Load the listener
		button.addActionListener(buttonListener());
		
		//Add radio buttons to group
		group.add(clinton);
		group.add(trump);
		group.add(sanders);
		group.add(cruz);
		
		//load the panel
		panel.add(label1);
		panel.add(fname);
		panel.add(label2);
		panel.add(lname);
		panel.add(label3);
		panel.add(clinton);
		panel.add(trump);
		panel.add(sanders);
		panel.add(cruz);
		panel.add(button);
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
				
			}
		};
		
		return listener;
	}	
}