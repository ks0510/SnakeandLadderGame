package snakeandladdergame;

/**
 * 
 * @author Kaif
 *
 */

public class SnakeandLadderUC2 {
	/**
	 * The following method created for making dice roll for player
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

		System.out.println("Player got dice value " + dicenumber);
	}
}
