package TheSimulationFill;

// This Class is for dispainrgon the console the selected boolean Array 
public class PrintOutBoardClars  implements PrintOutBoard {

	public void printBoard(boolean theBooleanBoardArr[][]) {

		for (int x = 0; x < theBooleanBoardArr.length; x++) {
			for (int y = 0; y < theBooleanBoardArr[x].length; y++) {

				if (theBooleanBoardArr[x][y])
					System.out.print("[1]");
				else
					System.out.print("[ ]");
			}
			System.out.println();

		}
		//just to give some space between the different Generations
		for (int i=0 ; i<3; i++)
			System.out.println();
	}

}
