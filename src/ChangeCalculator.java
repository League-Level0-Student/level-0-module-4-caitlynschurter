//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Nickels = JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
int centsNickles = Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
	String Dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int centsDimes = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
	String Quarters = JOptionPane.showInputDialog("How many quarters do you have?");
	int centsQuarters = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
double money = 0;
money += 0.05 * centsNickles;
money += 0.10 * centsDimes;
money += 0.25 * centsQuarters;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You has $" +money + " monies\n" +"YOURE RICH!!!");
	}
}

