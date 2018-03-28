import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet=JOptionPane.showInputDialog("Welcomes to da digital pet shoop. \n What pet would u likes todays?\n:D");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Whats should you do to helps your pet", "Pett Care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String [] { "Cuddle and pet", "Give Foodies and Waters", "Go for a stroll", "Groom/Bathe", "Clean up da buisness" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			if(task==0) {
			CuddleAndPet(pet);
			}
			
			if(task==1) {
				GiveFoodies(pet);
				}
			
			if(task==2) {
				GoForAStroll(pet);
				}
			
			if(task==3) {
				GroomBathe(pet);
				}
			
			if(task==4) {
				Buisness(pet);
				}
			
			
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

	static void CuddleAndPet(String pet) {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your kitty really liked dat. \n happiness level increased by 3");
			happinessLevel = happinessLevel + 3;
		}

	}
	
	static void GiveFoodies(String pet) {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your kitty thought dat was very tastey, though next time, tuna would be better. \n happiness level increased by 2");
			happinessLevel = happinessLevel + 2;
		}

	}
	
	static void GoForAStroll(String pet) {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your kitty DID NOT liked dat at all. Cat's don't go for walks dumbo! \n happiness level decreased by 5");
			happinessLevel = happinessLevel - 5;
		}

	}
	
	
	static void GroomBathe(String pet) {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your kitty didn't like that AT ALL. Kitties don't like water dumbo! \n happiness level decreased by 6");
			happinessLevel = happinessLevel - 6;
		}

	}
	
	
	static void Buisness(String pet) {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your kitty appreciated dat. Though, it didn't really mind... \n happiness level increased by 1");
			happinessLevel = happinessLevel + 1;
		}

	}
	
}




