import java.util.* ;
import java.io.*; 
/*
    The higherlower(int n) function can be called from guesser object
    @api: guesser.higherlower(n)
    return value will be -1 if n is lower, 0 is n is equal or 1 if n is higher.
*/

public class Solution {
    public static int numberGuess(int n, Guesser guesser) {
        for (int num = 1; num < n + 1; num++) {

			// If the number is found return the answer.
			if (guesser.higherlower(num) == 0) {
				return num;
			}
		}

		// Return -1, Never reach here.
		return -1;
    }

}
