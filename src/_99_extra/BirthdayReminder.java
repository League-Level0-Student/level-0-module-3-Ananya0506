
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 30th";
		String dadsBirthday = "November 6th";
		String myBirthday = "May 6th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("what birthday do you want?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			if (bday.equalsIgnoreCase("mom")) {
				System.out.println(momsBirthday);
			System.exit(0);
			}
		// 5. if user asked for "dad"
			if (bday.equalsIgnoreCase("dad")) {
				System.out.println(dadsBirthday);
			System.exit(0);
			}
		// 6. if user asked for your nameif (bday.equalsIgnoreCase("mom")) {
			if (bday.equalsIgnoreCase("Ananya")) {
				System.out.println(myBirthday);
			System.exit(0);
			}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {
				System.out.println("sorry, i don't remember that person's birthday!");
			}
	} 
}
