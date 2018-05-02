import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class The_Search_For_The_Mighty_Llamacorn {
public static void main(String[] args) {
	beginning();
}

public static void beginning() {
	JOptionPane.showMessageDialog(null, "Greetings Traveler. \nAfter researching for many years, you have finally narrowed the location of the almighty LLAMACORN to 2 places.\n "
			+ "The only question is... how are you going to get it? This is your quest to find it. \n"
			+ "With your trusty pet cat, you shall explore the different biomes of this magical land.\n Good luck!");
	
	int n = JOptionPane.showOptionDialog(null, "You've encountered a fork in the road. Where will you go?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
			new Object[]{"Go to the lolipop forest","Go towards the milkshake ocean"}, null);
	//System.out.println(n);
	
	if(n == 0) {
	forest();
	}
	
	if(n == 1) {
	ocean();	
	}
}

public static void forest() {
	int n = JOptionPane.showOptionDialog(null, "In the forest, you come across a squirrel. It looks harmless... but you can't be sure. Should you..?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
			new Object[]{"try and befriend it","Go towards the milkshake ocean"}, null);
	
	if(n==0) {
	squirrel();
	}
	
	
	if(n==1) {
	ocean();
	}
}

public static void ocean() {
	int n = JOptionPane.showOptionDialog(null, "You headed towards the ocean, but a vast dessert stands in between you. Do you..?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
			new Object[]{"Go to the lolipop forest","Cross the dessert"}, null);
	
		if(n==0) {
		forest();
		}
		
		
		if(n==1) {
		dessert();
		}
}

public static void dessert() {
	int n = JOptionPane.showOptionDialog(null, "The dessert was hot, tiring, and filled with hot fudge brownies. After many days, you see your cat getting tired, due to lack of water. Do you..?"
			, "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Go back the lolipop forest as quick as you can","say, ''suck it up kitty. we're going to the ocean!''"}, null);
	
		if(n==0) {
		forest2();
		}
		
		
		if(n==1) {
		sailboat();
		}
}

public static void squirrel() {
	int n = JOptionPane.showOptionDialog(null, "The squirrel ran away. It doesn't seem to like you. Oh well. Now what..?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
			new Object[]{"Continue through the forest","Eat the random mushroom that \nseems to have an interesting purple glow..."}, null);
	
		if(n==0) {
		forest3();
		}
		
		
		if(n==1) {
		deathMushroom();
		}
}

public static void deathMushroom() {
JOptionPane.showMessageDialog(null, "The mushroom was not very tasty... and it had poison in it... oh well... \nGAME OVER");	

}

public static void forest3() {
	int n = JOptionPane.showOptionDialog(null, "The forest leads to a ravine, and there's no way to go down safely. You might be able to make a rope, but it'll be risky. Do you..?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
			new Object[]{"Make a crude rope","Go back to the ocean"}, null);
	
	if(n==0) {
	deathRope();
	}
	
	
	if(n==1) {
	ocean();
	}
	
	
}

public static void deathRope() {
	JOptionPane.showMessageDialog(null, "The rope broke. And you fell... at least your cat's ok???  \nGAME OVER");
}


public static void sailboat() {
	int n = JOptionPane.showOptionDialog(null, "You reached the edge of the dessert, but your poor kitty did not. You may end your journey now, or sail a small boat across the ocean. Do you..?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
			new Object[]{"Sail the boat across the ocean","Go back home. I must honor my kitty."}, null);
	
	if(n==0) {
	island();
	}
	
	
	if(n==1) {
	home();
	}
	
	
	
}

public static void forest2() {
	int n = JOptionPane.showOptionDialog(null, "Your kitty is OK! But what to do now..?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
			new Object[]{"Head into the forest","Attempt to go back into the dessert."}, null);
	
	if(n==0) {
	forest();
	}
	
	
	if(n==1) {
	ocean();
	}
	
}

public static void island() {
	JOptionPane.showMessageDialog(null, "On the island is a cow named Koltenecker... But not far away from Koltenecker is the LLAMACORN!!! It took sacrifice, but you found it! You win!");
	
}

public static void home() {
	JOptionPane.showMessageDialog(null, "You honored your kitty. And you're now safely at home. Maybe something more calm next time? \n GAME OVER");
}



}
