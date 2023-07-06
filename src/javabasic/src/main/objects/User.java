package main.objects;

import main.utils.Constants;
import main.utils.RandomBase;

public class User {
	private int tokens;

	public User() {
		tokens = RandomBase.getRandomInteger(Constants.MIN_TOKENS, Constants.MAX_TOKENS);
	}
	
	public int getTokens() {
		return tokens;
	}

	protected void setTokens(int tokens) {
		this.tokens = tokens;
	}
	
	/**
	 * Transfer token to other user
	 * 
	 * @param receiver
	 * @param amount set amount = user's tokens if amount is bigger than user's tokens
	 */
	protected void transferTo(User receiver, int amount) {
		amount = Math.min(amount, tokens);
		
		tokens -= amount;
		receiver.tokens += amount;
	}
}
