package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class HappyThing {

public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("are you happy right now? yes or no?");

if (happy.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null,"keep doing whatever you're doing.");
}
if (happy.equalsIgnoreCase("no")) {
	String doubt  = JOptionPane.showInputDialog("do you want to be happy? yes or no?");
	if (doubt.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null,"change something.");
	}
	if (doubt.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null,"keep doing whatever you're doing.");
	}
}





















}
}