package TheSimulationFill;

public class Start extends Thread{

	public static void main(String[] args) {

		//// Calling all the class
		TimeLoope time = new TimeLoopeStarter();
		NewBoard boardCreator = new BoardCreator();
		ImpRulesOffTheGame round = new RulesOffTheGame();
		PrintOutBoard printOut = new PrintOutBoardClars();

		// How many times should ti loop
		int howMeanyLoops = 13;
		/// Wait time in seconds
		float howMeanyseconds = 5.22f;

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}

		time.setTimeLoop(howMeanyseconds, howMeanyLoops);

		// start time
		time.start();
		
		/// board size

		// also called X
		int row = 50;

		// also called Y
		int col = 50;

		boolean board[][] = boardCreator.theNewBoard(row, col);

		// What should be on the board
		board[1][1] = true;
		board[3][4] = true;
		board[4][3] = true;
		board[2][2] = true;
		board[3][3] = true;
		board[3][3] = true;

		printOut.printBoard(board);

		for (int inLoop = 0; inLoop <= howMeanyLoops; inLoop++) {
			
			time.getTimes(inLoop);
			board = round.whatHappenedAfterEachRound(board, row, col);
			printOut.printBoard(board);
		}

		// the rules

		// let's loop through array to print each row and column out

	}
}
