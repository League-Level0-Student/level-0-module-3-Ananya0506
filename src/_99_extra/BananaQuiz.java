
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String banana =  JOptionPane.showInputDialog("do you like bananas? yes or no?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (banana.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "you are crazy!!!");
	
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		else if (banana.equalsIgnoreCase("yes")) {
			String hobby = JOptionPane.showInputDialog("what is your favorite hobby?");
		JOptionPane.showMessageDialog(null, hobby + " is much better than bananas!");
			
		}
		
		
		
		
		
		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
		else {
			JOptionPane.showMessageDialog(null, "you are bananas!?");
		
		}
	
	
	}

}
