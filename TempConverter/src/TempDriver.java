import javax.swing.JFrame;


public class TempDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		TempConverter demo = new TempConverter();
		
		frame.getContentPane().add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}