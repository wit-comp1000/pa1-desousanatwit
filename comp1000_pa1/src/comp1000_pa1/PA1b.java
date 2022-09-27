package comp1000_pa1;

public class PA1b {
	public static void main(String[] args) {
		/* Variable Section */
		Scanner num = new Scanner(System.in);
		int num_yards = 0;	// used to calculate yards to in
		int num_ft = 0;		// used to calculate ft to in	
		int num_in = 0;		// used to hold in
		int total_in = 0;	// used to calculate the total in

		/* Input Section */
		System.out.println("Enter total number of inches: ");
		total_in = num.nextInt();
		
		/* Calculation section */
		num_yards = total_in / 36;	// calculating the number of yards using the total inches inputed
		total_in = total_in % 36; 	// calculating the remaining inches that can not be converted to yards
		num_ft = total_in / 12;		// using the remaining inches to calculate feet from the value
		num_in = total_in % 12;		// assigning the remaining inches that was not converted to yards or feet to in
		
		/* Output Section */
		System.out.println("Number of Yards: " + num_yards);
		System.out.println("Number of Feet : " + num_ft);
		System.out.println("Number of Inches: " + num_in);	
		
	}

}
