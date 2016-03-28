import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class TempConverter 
{
	private JPanel panel;
	private JButton FCbutton;
	private JButton FKbutton;
	private JButton CFbutton;
	private JButton CKbutton;
	private JButton KFbutton;
	private JButton KCbutton;
	private JTextField text;
	private JLabel label1;
	private JLabel label2;
	
	public TempConverter()
	{
		panel = new JPanel();
		FCbutton = new JButton("F to C");
		FKbutton = new JButton("F to K");
		CFbutton = new JButton("C to F");
		CKbutton = new JButton("C to K");
		KFbutton = new JButton("K to F");
		KCbutton = new JButton("K to C");
		text = new JTextField(5);
		label1 = new JLabel("Convert from:");
		label2 = new JLabel("Enter a temperature");
		
		//Load the listeners
		FCbutton.addActionListener(FCbuttonAction());
		FKbutton.addActionListener(FKbuttonAction());
		CFbutton.addActionListener(CFbuttonAction());
		CKbutton.addActionListener(CKbuttonAction());
		KFbutton.addActionListener(KFbuttonAction());
		KCbutton.addActionListener(KCbuttonAction());
		
		//load the panel
		panel.add(text);
		panel.add(label1);
		panel.add(FCbutton);
		panel.add(FKbutton);
		panel.add(CFbutton);
		panel.add(CKbutton);
		panel.add(KFbutton);
		panel.add(KCbutton);
		panel.add(label2);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	//F to C
	private ActionListener FCbuttonAction() 
	{
		//Create and define an action listener
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Attempt conversion
            	try
            	{
            		double tempInF = Double.parseDouble(input);//convert String to double
            		if(tempInF < -459.67) //If temp entered less than absolute zero
            		{
            			//Tell user to enter value greater than -459.67 F
            			String newText = "Enter a number >= -459.67 F (absolute zero)";
                		label2.setText(newText);
                		System.out.println(newText);
            		}
            		else
            		{
            			double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
            			String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
            			label2.setText(newText);
            			System.out.println(newText);
            		}
            	}
            	//If input not a number
            	catch (Exception ex)
            	{
            		//Tell user to input a number
            		String newText = "Enter a number >= -459.67 F (absolute zero)";
            		label2.setText(newText);
            		System.out.println(newText);
            	}
            }
        };
        return action;
    }
	//F to K
	private ActionListener FKbuttonAction() 
	{
		//Create and define an action listener
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Attempt conversion
            	try
            	{
            		double tempInF = Double.parseDouble(input);//convert String to double
            		if(tempInF < -459.67) //If temp entered less than absolute zero
            		{
            			//Tell user to enter value greater than -459.67 F
            			String newText = "Enter a number >= -459.67 F (absolute zero)";
                		label2.setText(newText);
                		System.out.println(newText);
            		}
            		else
            		{
            			double tempInK = (tempInF-32)*(5.0/9.0)+273.15; //convert F to K
            			String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
											       //only display 2 places past decimal
            			label2.setText(newText);
            			System.out.println(newText);
            		}
            	}
            	//If input not a number
            	catch (Exception ex)
            	{
            		//Tell user to input a number
            		String newText = "Enter a number >= -459.67 F (absolute zero)";
            		label2.setText(newText);
            		System.out.println(newText);
            	}
            }
        };
        return action;
    }
	//C to F
	private ActionListener CFbuttonAction() 
	{
		//Create and define an action listener
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Attempt conversion
            	try
            	{
            		double tempInC = Double.parseDouble(input);//convert String to double
            		if(tempInC < -273.15) //If temp entered less than absolute zero
            		{
            			//Tell user to enter value greater than -273.15
            			String newText = "Enter a number >= -273.15 C (absolute zero)";
                		label2.setText(newText);
                		System.out.println(newText);
            		}
            		else
            		{
            			double tempInF = tempInC*(9.0/5.0)+32; //convert C to F
            			String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
											       //only display 2 places past decimal
            			label2.setText(newText);
            			System.out.println(newText);
            		}
            	}
            	//If input not a number
            	catch (Exception ex)
            	{
            		//Tell user to input a number
            		String newText = "Enter a number >= -273.15 C (absolute zero)";
            		label2.setText(newText);
            		System.out.println(newText);
            	}
            }
        };
        return action;
    }
	//C to K
	private ActionListener CKbuttonAction() 
	{
		//Create and define an action listener
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Attempt conversion
            	try
            	{
            		double tempInC = Double.parseDouble(input);//convert String to double
            		if(tempInC < -273.15) //If temp entered less than absolute zero
            		{
            			//Tell user to enter value greater than -273.15
            			String newText = "Enter a number >= -273.15 C (absolute zero)";
                		label2.setText(newText);
                		System.out.println(newText);
            		}
            		else
            		{
            			double tempInK = tempInC+273.15; //convert C to K
            			String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
											       //only display 2 places past decimal
            			label2.setText(newText);
            			System.out.println(newText);
            		}
            	}
            	//If input not a number
            	catch (Exception ex)
            	{
            		//Tell user to input a number
            		String newText = "Enter a number >= -273.15 C (absolute zero)";
            		label2.setText(newText);
            		System.out.println(newText);
            	}
            }
        };
        return action;
    }
	//K to F
	private ActionListener KFbuttonAction() 
	{
		//Create and define an action listener
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Attempt conversion
            	try
            	{
            		double tempInK = Double.parseDouble(input);//convert String to double
            		if(tempInK < 0) //If temp entered less than absolute zero
            		{
            			//Tell user to enter value greater than 0
            			String newText = "Enter a number >= 0 K (absolute zero)";
                		label2.setText(newText);
                		System.out.println(newText);
            		}
            		else
            		{
            			double tempInF = (tempInK-273.15)*(9.0/5.0)+32; //convert K to F
            			String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
											       //only display 2 places past decimal
            			label2.setText(newText);
            			System.out.println(newText);
            		}
            	}
            	//If input not a number
            	catch (Exception ex)
            	{
            		//Tell user to input a number
            		String newText = "Enter a number >= 0 K (absolute zero)";
            		label2.setText(newText);
            		System.out.println(newText);
            	}
            }
        };
        return action;
    }
	//K to C
	private ActionListener KCbuttonAction() 
	{
		//Create and define an action listener
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Attempt conversion
            	try
            	{
            		double tempInK = Double.parseDouble(input);//convert String to double
            		if(tempInK < 0) //If temp entered less than absolute zero
            		{
            			//Tell user to enter value greater than 0
            			String newText = "Enter a number >= 0 K (absolute zero)";
                		label2.setText(newText);
                		System.out.println(newText);
            		}
            		else
            		{
            			double tempInC = tempInK-273.15; //convert K to C
            			String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
            			label2.setText(newText);
            			System.out.println(newText);
            		}
            	}
            	//If input not a number
            	catch (Exception ex)
            	{
            		//Tell user to input a number
            		String newText = "Enter a number >= 0 K (absolute zero)";
            		label2.setText(newText);
            		System.out.println(newText);
            	}
            }
        };
        return action;
    }
	
}