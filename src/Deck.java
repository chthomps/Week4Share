public class Deck {

	// Creates 2-D array representing a deck of cards
	public static void main(String[] args) {

		int[][] table = new int[13][4];

		// loading 52 card values
		for (int row = 0; row < table.length; row++)
			for (int col = 0; col < table[row].length; col++)
				table[row][col] = 100 + (row + 1) + col * 100;

		// print
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++)
				System.out.print(table[row][col] + "\t");
			System.out.println();

		}

	}

}
