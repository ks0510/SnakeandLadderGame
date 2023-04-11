package snakeandladdergame;

/**
 * 
 * @author Kaif
 *
 */

public class SnakeandLadderUC7 {

	/**
	 * Created following method to create snake and ladder game between two players
	 * and who get low roll dice count to reach position 100 will be winner
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * Declaring position of player zero 
		 * Used while loop to insure our player should reach the winning position 
		 * To get dice value To check player chance to play or get snake or ladder using random 
		 * To check options for player using if condition As mentioned in problem in
		 * case the player position go above 100,
		 * the player stays in the same previous position till the player gets the exact
		 * number that adds to 100 
		 * As mentioned in problem statement if value of position is less than zero 
		 * then player should start from zero position 
		 * Created this method if player got a ladder he get another  chance to play 
		 */

		int player = 1;
		int count1 = 0;
		int count2 = 0;
		int count = 0;

		/*
		 * Using for loop because number of players is two
		 */

		for (; player <= 2; player++) {

			/*
			 * Declaring position of player to zero
			 */

			int position = 0;

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
						// System.out.println("Player got ladder");
						// System.out.println("Player shifted forward by " + dicenumber + " number");
					} else if ((position == 95 && dicenumber == 5) || (position == 96 && dicenumber == 4)
							|| (position == 97 && dicenumber == 3) || (position == 98 && dicenumber == 2)
							|| (position == 99 && dicenumber == 1)) {
						position += dicenumber;
						// System.out.println("Player got ladder");
						// System.out.println("Player shifted forward by " + dicenumber + " number");
					} else {
						continue;
					}

					/*
					 * If player get a ladder he get one more chance
					 */

					int position2 = getrandom();
					position += position2;
				} else if (value == 2) {
					position -= dicenumber;

					/*
					 * As mentioned in problem statement if value of position is less than zero
					 * player should start from zero position
					 */
					if (position < 0) {
						position = 0;
					}

				} else {
					continue;
				}
                count++;
			}
			
			/*
			 * Counting dice roll for declaring winner
			 */
			if (player == 1) {
				count1 = count;
				System.out.println("Roll of dice needed to win player1 " + count);
			} else if (player == 2) {
				count2 = count;
				System.out.println("Roll of dice needed to win player2 " + count);
			}

		}
		if (count1 < count2) {
			System.out.println("Player one is winner");
		} else {
			System.out.println("Player two is winner");
		}
	}

	/*
	 * Created this method if player got a ladder he get another chance to play
	 */

	public static int getrandom() {

		int dice = (int) Math.floor(Math.random() * 6 + 1);

		int result = (int) Math.floor(Math.random() * 3);

		if (result == 1) {
			return dice;
		} else if (result == 2) {
			return -dice;
		} else {
			return 0;
		}
	}
}
