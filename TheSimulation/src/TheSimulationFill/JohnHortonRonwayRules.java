package TheSimulationFill;

/* In my first draft of the rules in the app. I made them according to what I remember of this "Game", but after re watching the video again ( https://www.youtube.com/watch?v=HeQX2HjkcNov ) 
I can now see that I got it wrong and it need to do a correction, so that is why for I have copied most of the first version of the rules
class cold RulesOffTheGame in to the new calss cold JohnHortonRonwayRules and chenced the rules. 
The changes have been done in line 45. */

// One more ting I can see that I got the name wrong, it is not John Horton Ronway but John Horton Conway,

public class JohnHortonRonwayRules implements ImpRulesOffTheGame {

	@Override
	public boolean[][] whatHappenedAfterEachRound(boolean[][] TheBoardSoFar, int row, int col) {

		// Creat a new board, so that we can move the result to and send out.
		boolean[][] newBoard = new boolean[row][col];

		// cod to fold the array any with
		for (int rowOnBoard = 0; rowOnBoard < col; rowOnBoard++) {

			for (int colOnBoard = 0; colOnBoard < row; colOnBoard++) {

				// check a raunt on the seraunding fields
				int i = 0;

				for (int rowCheck = rowOnBoard - 1; rowCheck <= rowOnBoard + 1; rowCheck++) {
		
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

				if (i == 2 && TheBoardSoFar[rowOnBoard][colOnBoard]) {
					newBoard[rowOnBoard][colOnBoard] = true;
				} else if (i == 3) {
					newBoard[rowOnBoard][colOnBoard] = true;
				}

			}

		}

		return newBoard;

	}
}
