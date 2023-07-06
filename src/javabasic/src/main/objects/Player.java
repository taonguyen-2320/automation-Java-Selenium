package main.objects;

import main.utils.Constants;

public class Player extends User {
	
	/**
	 * Trade token from player to host
	 * 
	 * @param host
	 * @param totalValue
	 */
	public void tradeTokens(User host, int totalValue) {
		if (totalValue == Constants.DOUBLE_BREAKPOINT) {
			setTokens(getTokens() * 2);
		} else if (totalValue == Constants.DIVIDE_BREAKPOINT) {
			setTokens(getTokens() / 2);
		} else if (totalValue > 0) {
			host.transferTo(this, totalValue);
		} else if (totalValue < 0) {
			transferTo(host, Math.abs(totalValue));
		}
	}
}
