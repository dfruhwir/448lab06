import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Vote 
{
	private JPanel panel;
	private JButton button;
	private JTextField fname;
	private JTextField lname;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JRadioButton clinton;
	private JRadioButton trump;
	private JRadioButton sanders;
	private JRadioButton cruz;
	private ButtonGroup group;
	
	public Vote()
	{
		panel = new JPanel();
		button = new JButton("Vote!");
		fname = new JTextField(10);
		lname = new JTextField(10);
		label1 = new JLabel("First name:");
		label2 = new JLabel("Last name:");
		label3 = new JLabel("Please choose a candidate:");
		label4 = new JLabel();
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
		panel.add(label4);
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
				String f = fname.getText();
				String l = lname.getText();
				if(f.equals(""))
				{
					String newText = "Please enter a first name";
            		label4.setText(newText);
            		System.out.println(newText);
				}
				else if(l.equals(""))
				{
					String newText = "Please enter a last name";
            		label4.setText(newText);
            		System.out.println(newText);
				}
				else
				{
					try
					{
						FileReader myFileReader = new FileReader(l + "_" + f + "_ballot.txt");
						String newText = "User already voted";
	            		label4.setText(newText);
	            		System.out.println(newText);
					}
					catch (Exception ex)
					{
						try
						{
							FileWriter fstream = new FileWriter(l + "_" + f + "_ballot.txt");
							BufferedWriter out = new BufferedWriter(fstream);
							out.write("Hillary Clinton");
							out.close();
							String newText = "Vote casted!";
		            		label4.setText(newText);
		            		System.out.println(newText);
						}
						catch(Exception ex2)
						{
							String newText = "Error: " + ex2.getMessage();
		            		label4.setText(newText);
		            		System.out.println(newText);
						}
					}

				}
			}
		};
		
		return listener;
	}	
}