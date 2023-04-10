package snakeandladdergame;
/**
 * 
 * @author Kaif
 *
 */

public class SnakeandLadderUC6 {
	
	/**
	 * Created method Report the number of times the dice was
         * played to win the game and also the position 
         * after every dice roll
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 * Declaring position of player zero 
		 * Used while loop to insure our player should reach the winning position 
		 * To get dice value To check player chance to play or get snake or ladder using random 
		 * To check options for player using if condition
		 * As mentioned in problem in case the player position go above 100, the player stays in the same previous
                 * position till the player gets the exact number that adds to 100
		 * As mentioned in problem statement if value of position is less than
		 * zero then player should start from zero position
		 * As mentioned in UC6 problem to display the position of
	         * player after every dice roll
	         * To display how many time dice rolled to reach winning position
		 */

		/*
		 * Declaring position of player to zero
		 */

		int position = 0, count = 0;

		/*
		 * Used while loop to insure our player should reach the winning position
		 */

		while (position != 100) {

			/*
			 * To get dice value
			 */

			int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

			/*
			 * To check player chance to play or get snake or ladder using random
			 */

			int value = (int) Math.floor(Math.random() * 3);

			/*
			 * To check options for player using if condition
			 */

			if (value == 1) {

				/*
				 * As mentioned in problem in case the player position go above 100, the player
				 * stays in the same previous position till the player gets the exact number
				 * that adds to 100
				 */
				if (position < 95) {
					position += dicenumber;
					System.out.println("Player got ladder");
					System.out.println("Player shifted forward by " + dicenumber + " number");
				} else if ((position == 95 && dicenumber == 5) || (position == 96 && dicenumber == 4)
						|| (position == 97 && dicenumber == 3) || (position == 98 && dicenumber == 2)
						|| (position == 99 && dicenumber == 1)) {
					position += dicenumber;
					System.out.println("Player got ladder");
					System.out.println("Player shifted forward by " + dicenumber + " number");
				} else {
					continue;
				}
			} else if (value == 2) {
				position -= dicenumber;
				System.out.println("Player got snake");
				System.out.println("Player shifted backward by " + dicenumber + " number");

				/*
				 * As mentioned in problem statement if value of position is less than zero
				 * player should start from zero position
				 */
				if (position < 0) {
					position = 0;
				}

			} else {
				System.out.println("Player should stay on same position");
			}

			/*
			 * As mentioned in UC6 problem to display the position of player after every
			 * dice roll
			 */
			System.out.println("Current position of player " + position);
			count++;
		}

		/*
		 * To display how many time dice rolled to reach winning position
		 * 
		 */

		System.out.println(count + " dice roll is played to win the player");
	}
}
//SnakeandLadderUC6.java(END)
