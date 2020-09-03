public class Change {
	public static void main(String[] args) {

	}


	/*
		The method below is deeply flawed and even if I completed it,
		it's still incorrect. The biggest part it's missing is it doesn't 
		account for the possibility of making quarters up of other coins,
		or dimes of other coins, etc.

		A far superior way would be to use recursion.
	*/
	public static int NumberOfWaysToMakeChange(int cents) {
		int numWays = 0;
		int quarters = cents / 25;
		int dimes = cents / 10;
		int nickels = cents / 5;
		int pennies = cents;
		if (cents > 25) {
			while (quarters > 0) {
				//cents -= 25;
				if (cents % 25 == 0) {
					numWays++;
				}
				else {
					cents -= quarters * 25;
					quarters--;
					if (cents / 10) {
						while (dimes > 0) {
							if (cents % 10 == 0) {
								numWays++;
							}
							else {
								cents = cents % 10;
							}
						}
					}
				}
				quarters--;

			}

		}
	}
}