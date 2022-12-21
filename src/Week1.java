
public class Week1 {

	public static void main(String[] args) {
	/*Question 1
	 *Create a variable to hold the quantity of available plane seats left on a flight.
	 */
	int planeSeatsLeft = 10;
	
	/*Question 2
	 *Create a variable to hold the cost of groceries at checkout. 
	 */
	double costOfGroceries = 86.89;
	
	/*Question 3
	 *Create a variable to hold a person's middle initial.
	 */
	char middleInitial = 'I';
	
	/*Question 4
	 *Create a variable to hold true if it's hot outside and false if it's cold outside.
	 */
	boolean isHotOutside = true;
	boolean isColdOutside = false;
	
	/*Question 4
	 *Create a variable to hold a person's first name.
	 */
	String firstName = "Daniel";
	
	/*Question 5
	 *Create a variable to hold a street address. 
	 */
	String streetAddress = "128 White Oak Road";
	
	/*Question 6
	 *Print all variables to the console. 
	 */
	System.out.println(planeSeatsLeft);
	System.out.println(costOfGroceries);
	System.out.println(middleInitial);
	System.out.println(isHotOutside);
	System.out.println(isColdOutside);
	System.out.println(firstName);
	System.out.println(streetAddress);
	
	/*Question 7
	 *A customer booked two plane seats, remove two seats from the available seats variable. 
	 */
	planeSeatsLeft = planeSeatsLeft - 2;
	System.out.println(planeSeatsLeft);
	
	/*Question 8
	 *Impulse candy bar purchase, add 2.15 to the grocery total.
	 */
	costOfGroceries = costOfGroceries + 2.15;
	System.out.println(costOfGroceries);
	
	/*Question 9
	 *Birth Certificate was printed incorrectly, change the middle initial to something else. 
	 */
	middleInitial = 'J';
	System.out.println(middleInitial);
	
	/*Question 10
	 *The season has changed. Update the hot outside variable to be opposite of what it was.
	 */
	isHotOutside = !isHotOutside;
	System.out.println(isHotOutside);
	
	/*Question 11
	 *Create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice.
	 */
	String fullName = "Daniel" + " " + "I" + " " + "Hurd";
	System.out.println(fullName);
	
	/*Question 12
	 * print a line to the console that introduces the customer and says they live at the address available.
	 */
	System.out.println("Hello" + " " + fullName + " " + "You live at" + streetAddress + ".");
	
	}
	

}
