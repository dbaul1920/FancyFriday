import java.util.Scanner;

/**
 * 
 */
/* This is a demo app for picking out outfits */
/**
 * @author DomB
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String inputFancyFriday, inputSunny, inputRaining;
			boolean fancyFriday = false;
			boolean sunny = false;
			boolean raining = false;
		
		// Get input from user
			Scanner input = new Scanner(System.in);
			System.out.println("Is it Fancy Friday?");
			inputFancyFriday = input.nextLine();
			
			System.out.println("Is it sunny?");
			inputSunny = input.nextLine();
			
			System.out.println("Is it raining?");
			inputRaining = input.nextLine();
		
		// Quick test goes here	- Just making sure it works 
		//	System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRaining);
			
		// Set condition variables
			
			if (inputFancyFriday.equalsIgnoreCase("y")){
				fancyFriday = true;				
			}
			if (inputSunny.equalsIgnoreCase("y")){
				sunny = true;				
			}
			if (inputRaining.equalsIgnoreCase("y")){
				raining = true;				
			}
			
		//Boolean test	
			System.out.println(fancyFriday + " " + sunny + " " + raining);
		
		// Use if  statements to decide what to wear
		

	}

}
