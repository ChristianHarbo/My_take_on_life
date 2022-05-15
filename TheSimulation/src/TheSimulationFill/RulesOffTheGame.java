package TheSimulationFill;

public class RulesOffTheGame implements ImpRulesOffTheGame {

	public boolean[][] whatHappenedAfterEachRound(boolean TheBoardSoFar[][], int row, int col) {
		int tester1 = 0;
		int tester2 = 0;
		// Creat a new board, so that we can move the result to and send out.
		boolean[][] newBoard = new boolean[row][col];

		// Creat a new Board with int fields that we can put the test recult on.
		int[][] testIntBoard = new int[row][col];
		
		// cod to fold the array any with
		for (int rowOnBoard = 0; rowOnBoard < col; rowOnBoard++) {
			tester2++;
			for (int colOnBoard = 0; colOnBoard < row; colOnBoard++) {

				// check a raunt on the seraunding fields
				int i = 0;

				for (int rowCheck = rowOnBoard - 1; rowCheck <= rowOnBoard + 1; rowCheck++) {
					tester1++;
					for (int colCheck = colOnBoard - 1; colCheck <= colOnBoard + 1; colCheck++) {

						// Make sure that we do not use the test the edge of the board
						if (rowCheck == -1 || colCheck == -1 || rowCheck == row || colCheck == col) {
							// Check that we are not caunding the field it self
						} else if (rowCheck == rowOnBoard && colCheck == colOnBoard) {
							// if the fild can be caunted 
						} else {
							
							if (TheBoardSoFar[rowCheck][colCheck])
							i++;
							

						}
						
						// if not out of baund and the field is true add to int i

					}
				}
					if (i ==2 ||i== 3)
						newBoard[rowOnBoard][colOnBoard]= true;
				
				

				testIntBoard[rowOnBoard][colOnBoard] = i;

			}
			

		}
		System.out.println("col: " + TheBoardSoFar.length);
		

		/// for testing
		System.out.println(tester1 + " test1");
		System.out.println(tester2 + " test2");

		return newBoard;

	}
}

/*
 * for (int rowOnBoard = 0; row < TheBoardSoFar.length; rowOnBoard++) { for (int
 * colOnBoard = 0; col < TheBoardSoFar[row].length; colOnBoard++) {
 * 
 * System.out.print(TheBoardSoFar[rowOnBoard][colOnBoard] + "\t"); }
 * System.out.println(); }
 */
