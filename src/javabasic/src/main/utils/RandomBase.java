package main.utils;

import java.util.Random;

public class RandomBase {

	/**
	 * Generate a random integer from min to max value
	 * 
	 * @parammin smallest integer
	 * @param max biggest integer
	 * @return
	 */
	public static int getRandomInteger(int min, int max) {
		Random random = new Random();
		return random.nextInt(min, max + 1);
	}
	
	/**
	 * Sum of some random integers
	 * 
	 * @param numberOfIntegers
	 * @param min smallest integer
	 * @param max biggest integer
	 * @return
	 */
	public static int getTotalRandomIntegers(int numberOfIntegers, int min, int max) {
		int total = 0;
		
		for (int i = 0; i < numberOfIntegers; i++) {
			total += getRandomInteger(min, max);
		}
		
		return total;
	}
}
