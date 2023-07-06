package test;

import main.objects.Player;
import main.objects.User;
import main.utils.Constants;
import main.utils.RandomBase;

public class LuckyTokensTests {

	public static void main(String[] args) {
		Player player = new Player();
		User host = new User();
		
		int round = 0;
		
		while (player.getTokens() > 0 && host.getTokens() > 0) {
			round++;
			System.out.println("Round: " + round);
			System.out.println("Player's tokens: " + player.getTokens());
			System.out.println("Host's tokens: " + host.getTokens());
			
			int total = RandomBase.getTotalRandomIntegers(player.getTokens(), Constants.MIN_RANDOM_INT, Constants.MAX_RANDOM_INT);
			
			System.out.println("Total: " + total);
			
			player.tradeTokens(host, total);

			System.out.println("Player's tokens: " + player.getTokens());
			System.out.println("Host's tokens: " + host.getTokens());
			System.out.println("--------------------");
		}
		
		if (player.getTokens() > 0) {
			System.out.println("Player wins");
		} else {
			System.out.println("Host wins");
		}
	}
}
