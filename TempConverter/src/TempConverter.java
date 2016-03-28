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
	private JLabel label;
	
	public TempConverter()
	{
		panel = new JPanel();
		FCbutton = new JButton("Convert from F to C");
		FKbutton = new JButton("Convert from F to K");
		CFbutton = new JButton("Convert from C to F");
		CKbutton = new JButton("Convert from C to K");
		KFbutton = new JButton("Convert from K to F");
		KCbutton = new JButton("Convert from K to C");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Enter a temperature");
		
		//Load the listeners
		FCbutton.addActionListener(FCbuttonAction());
		//FKbutton.addActionListener(FKbuttonAction());
		//CFbutton.addActionListener(CFbuttonAction());
		//CKbutton.addActionListener(CKbuttonAction());
		//KFbutton.addActionListener(KFbuttonAction());
		//KCbutton.addActionListener(KCbuttonAction());
		
		//load the panel
		panel.add(text);
		panel.add(FCbutton);
		panel.add(FKbutton);
		panel.add(CFbutton);
		panel.add(CKbutton);
		panel.add(KFbutton);
		panel.add(KCbutton);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	private ActionListener FCbuttonAction() 
	{
		//Create and define an action listener for button2
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
            }
        };
        return action;
    }
}