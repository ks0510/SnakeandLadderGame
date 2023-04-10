package snakeandladdergame;

/**
 * 
 * @author Kaif
 *
 */

public class SnakeandLadderUC1 {
	/**
	 * Method to start the game with single player
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Player p1 = new Player();
		int position = 0, count = 0;

		System.out.println("Start the game");

		while (position != 100) {
			count++;
			int dicevalue = (int) Math.floor(Math.random() * 6 + 1);
			position = position + dicevalue;
			if ((position <= 95 && dicevalue == 5) || (position <= 96 && dicevalue == 4)
					|| (position <= 97 && dicevalue == 3) || (position <= 98 && dicevalue == 2)
					|| (position <= 99 && dicevalue == 1)) {
				position += dicevalue;
			}
		}

		System.out.println("Player p1 win the game after " + count + " dice rolls");
	}
}
