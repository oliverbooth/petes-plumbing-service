import javax.swing.*;

public class Program {
	
	public static void main(String args[]) {
		// Declare variables
		float distance, hours, plasticPipe, copperPipe, chromePipe;
		// Set charges for labour 
		float distanceCharge = 1f, hourCharge = 40f, plasticCharge = 2f, copperCharge= 3f, chromeCharge = 4f;
		
		System.out.println("PETE'S PLUMBING SERVICE\n" +
				"------------------------");
		
		// Ask for distance travelled
		distance    = getInput("Please enter the distance travelled in miles:");
		distance   *= distanceCharge;
		System.out.println("Distance        £ " + distance);
		
		// Ask for hours worked
		hours       = getInput("Please enter the amount of hours worked:");
		hours      *= hourCharge;
		System.out.println("Labour          £ " + hours);
		
		// Ask how much plastic pipe was used
		plasticPipe  = getInput("Please enter the length of plastic pipe used:");
		plasticPipe *= plasticCharge;
		System.out.println("Plastic pipes   £ " + plasticPipe);

		// Ask how much copper pipe was used
		copperPipe   = getInput("Please enter the length of copper pipe used:");
		copperPipe *= copperCharge;
		System.out.println("Copper pipes    £ " + copperPipe);
		
		// Ask how much chrome pipe was used
		chromePipe  = getInput("Please enter the length of chrome pipe used:");
		chromePipe *= chromeCharge;
		System.out.println("Chrome pipes    £ " + chromePipe);

		// Sum up the total
		float total = distance + hours + plasticPipe + copperPipe + chromePipe;

		// Output the total
		System.out.println("------------------------" +
				           "\nTOTAL           £ " + total);
		
		// Exit the application
		System.exit(0);
	}
	
	public static float getInput(String message) {
		float buffer = 0f;
		
		try {
			// Get input from the user with the message specified
			String inp = JOptionPane.showInputDialog(null,
					message,
					"Pete's Job Estimator", 
					JOptionPane.QUESTION_MESSAGE);
			
			buffer = Float.parseFloat(inp); // Parse the string as a float
		} catch(Exception e) {
			buffer = 0f;
		}
		
		return buffer;
	}
	
}
