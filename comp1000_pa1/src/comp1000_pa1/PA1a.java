package comp1000_pa1;

public class PA1a {
  public static void main(String[] args) {
		
		/* Variable Section */
		Scanner num = new Scanner(System.in);
		int num_yards = 0;	// used to calculate yards to in
		int num_ft = 0;		// used to calculate ft to in	
		int num_in = 0;		// used to hold in
		int total_in = 0;	// used to calculate the total in

		/* Input Section */
		System.out.println("Enter the number of yards: ");
		num_yards = num.nextInt();
		
		System.out.println("Enter number of feet: ");
		num_ft = num.nextInt();
		
		System.out.println("Enter number of inches: ");
		num_in = num.nextInt();
		
		/* Calculation Section  */
		total_in = (num_yards * 36) + (num_ft * 12); // calculating yards to in and ft to in then adding those values together
		total_in += num_in;							 // adding the remaining in to the total in
		
		/* Output Section */
		System.out.println();
		System.out.println("Total number of inches: " + total_in);
	}

}
