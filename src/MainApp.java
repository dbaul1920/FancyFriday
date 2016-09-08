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
			boolean fancyFriday, suny, raining;
		
		// Get input from user
			Scanner input = new Scanner(System.in);
			System.out.println("Is it Fancy Friday?");
			inputFancyFriday = input.nextLine();
			
			System.out.println("Is it sunny?");
			inputSunny = input.nextLine();
			
			System.out.println("Is it raining?");
			inputRaining = input.nextLine();
		
		// Quick test goes here	
			System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRaining);
			
		// Set condition variables
		
		// Use if  statements to decide what to wear
		

	}

}
