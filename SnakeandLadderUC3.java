package snakeandladdergame;

/**
 * 
 * @author Kaif
 *
 */

public class SnakeandLadderUC3 {
	/**
	 * Created this method to check whether player get chance to play, snake or
	 * ladder
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Assuming current position of player for scenario To get dice value To check
		 * player chance to play or get snake or ladder using random To check options
		 * for palyer using condition
		 */

		/*
		 * Assuming current position of player for scenario
		 */
		int position = 20;

		/*
		 * To get dice value
		 */

		int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

		/*
		 * To check player chance to play or get snake or ladder using random
		 */

		int value = (int) Math.floor(Math.random() * 3);

		/*
		 * To check options for palyer using condition
		 */

		if (value == 1) {
			position += dicenumber;
			System.out.println("Player got ladder");
			System.out.println("Player shifted forward by " + dicenumber + " number");
		} else if (value == 2) {
			position -= dicenumber;
			System.out.println("Player got snake");
			System.out.println("Player shifted backward by " + dicenumber + " number");
		} else {
			System.out.println("Player should stay on same position");
		}
	}
}
//SnakeandLadderUC3.java (END);
