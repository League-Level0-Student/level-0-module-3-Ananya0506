
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	   Robot robot= new Robot();
		//2. Make the robot draw a shape (this will take more than one line of code)		
		while(true) {
	  
		//3. Set the pen width to 10
		robot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("what color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
        if (color.equalsIgnoreCase("red")) {
        	robot.setPenColor(252, 0, 0);
        }
        else if (color.equalsIgnoreCase("blue")) {
        	robot.setPenColor(0, 97, 252);
        }
        else if (color.equalsIgnoreCase("orange")) {
        	robot.setPenColor(252, 130, 0);
        }
        else if (color.equalsIgnoreCase("yellow")) {
        	robot.setPenColor(252, 244, 0);
        }
        else if (color.equalsIgnoreCase("green")) {
        	robot.setPenColor(0, 252, 25);
        }
        else if (color.equalsIgnoreCase("purple")) {
        	robot.setPenColor(160, 0, 252);
        }
        else  if (color.equalsIgnoreCase("pink")) {
        	robot.setPenColor(252, 0, 189);
        }
        else if (color.equalsIgnoreCase("black")) {
        	robot.setPenColor(2, 8, 0);
        }else {
        	robot.setRandomPenColor();
        }
        robot.setSpeed(50);
 	   robot.hide();
 	   robot.penDown();
 		robot.move(100);
 		robot.turn(90);
 		robot.move(100);
 		robot.turn(90);
 		robot.move(100);
 		robot.turn(90);
 		robot.move(100);
	}
        
        
        
        //6. If the user doesn't enter anything, choose a random color
        
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
