/*
* This is my take  on John Horton Ronway "Game" called Life  
* */

package TheSimulationFill;

import Output.MyFrame;

import Output.PrintOutBoard;
import Output.PrintOutBoardClars;
import Output.TimeLoope;
import Output.TimeLoopeStarter;

public class Start extends Thread {
	
	static int col;
	static int row;
	public void steRowCol (int setRow, int setCol) {
		row =setRow;
		col = setCol;
	}

	public static void main(String[] args) {

		//// Calling all the class
		TimeLoope time = new TimeLoopeStarter();
		NewBoard boardCreator = new BoardCreator();
		ImpRulesOffTheGame round = new JohnHortonRonwayRules();
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
		row = 30;

		// also called Y
		col = 30;

		// make new board and What should be on the board and as well set row, col.

		boardCreator.theNewBoard(row, col);
		boolean board[][] = boardCreator.getnewBoard();



		// to open the Window
		new MyFrame();

		for (int inLoop = 0; inLoop <= howMeanyLoops; inLoop++) {
			printOut.printBoard(board);
			time.getTimes(inLoop);
			board = round.whatHappenedAfterEachRound(board, row, col);

		}


	}
}
