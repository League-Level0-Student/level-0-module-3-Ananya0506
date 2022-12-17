package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		
	
	String place = JOptionPane.showInputDialog("choose a place");
	
	String sound = JOptionPane.showInputDialog("choose a unusual sound that is very rare");
	
	String thing = JOptionPane.showInputDialog("choose a thing. it could be an animal, plant, object, etc.");
	
	String verb = JOptionPane.showInputDialog("choose a verb that is a movement");
	
	String smell = JOptionPane.showInputDialog("choose any smell that you'd like. it could be sweet, stinky, etc.");
	
	String liquid = JOptionPane.showInputDialog("choose any liquid.");
	
	String adj = JOptionPane.showInputDialog("choose an adjective. examples: worried, happy, mad, etc.");
	
	String thingy = JOptionPane.showInputDialog("choose another thing.");
	
	String food = JOptionPane.showInputDialog("choose a food");
	
	JOptionPane.showMessageDialog(null, "it was a very normal day.\n"
			+ "i was in " + place + " , and i was enjoying myself.\n"
			+ "suddenly, i heard a " + sound + " noise. i turned around, and saw a " + thing + "!\n"
			+ "surprised, i " + verb + " out of" + place + ".\n"
			+ " i turned a corner, and suddenly, the air started to smell very " + smell + " !\n" 
			+ "even more astounded, i followed the scent. then, i found a door! i opened it and went inside.\n " 
			+ "but then, i was dumped with " + liquid + "! i coudn't believe my luck!\n"
			+ "i was so " + adj + "! then, i saw a " + thingy + ". i touched it cautiously, and i was whisked back to my house!\n"
			+ "with all the events that happened today, i was very tired and looking forward to some " + food + ".");
	
	
	 
	
	
}
}