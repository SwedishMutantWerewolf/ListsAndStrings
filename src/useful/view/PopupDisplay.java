package useful.view;

import javax.swing.JOptionPane;

/**
 * The popup display class for CTEC Am Session 2017
 * @author Amber Bullough
 *@version 01.3.10.2017
 */
public class PopupDisplay 
{
	/**
	 * Displays the supplied message in a popup window.
	 * @param message The Message that is displayed
	 */
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	
	/**
	 * Displayed the supplied question as a popup and returns the answer as a string.
	 * @param fromQuestion The question to ask the user.
	 * @return The String Answer
	 */
	public String getResponse (String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
		
		return response;
		
	}
}
