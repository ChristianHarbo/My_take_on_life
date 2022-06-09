package TheSimulationFill;


public class BoardCreator implements NewBoard {
	
	static int rowOnBoard;
	static int colOnBoard;
	boolean [][] newBoard;
	
	@Override
	public boolean [][] theNewBoard(int row , int col){
		
		
		rowOnBoard = row;
		colOnBoard = col;	
		newBoard = new boolean [rowOnBoard][colOnBoard]; 
		newBoard= startingBoard(newBoard);
		return newBoard;
		
	}
	
	public boolean [][] getnewBoard (){
		return newBoard;
	}
	
	// the class for the starting point
	public boolean [][] startingBoard (boolean [][] board) {
		int i = 5;
		int x = 4;
		board[10][5-x] = true;
		board[12][5-x] = true;
		board[12][6-x] = true;
		board[14][7-x] = true;
		board[11][8-x] = true;
		board[12][10-x] = true;
		board[13][10-x] = true;
		board[11][11-x] = true;
		board[12][11-x] = true;
		board[13][12-x] = true;
		board[14][13-x] = true;
		board[13][14-x] = true;
		board[11][15-x] = true;
		
		board[10-i][5-x] = true;
		board[12-i][5-x] = true;
		board[12-i][6-x] = true;
		board[14-i][7-x] = true;
		board[11-i][8-x] = true;
		board[12-i][10-x] = true;
		board[13-i][10-x] = true;
		board[11-i][11-x] = true;
		board[12-i][11-x] = true;
		board[13-i][12-x] = true;
		board[14-i][13-x] = true;
		board[13-i][14-x] = true;
		board[11-i][15-x] = true;
		board[12-i][15-x] = true;
		board[13-i][16-x] = true;
		board[14-i][16-x] = true;
		board[12-i][17-x] = true;
		board[14-i][17-x] = true;
		board[11-i][18-x] = true;
		board[12-i][18-x] = true;
		board[13-i][18-x] = true;
		board[15-i][18-x] = true;
		board[17-i][18-x] = true;
		board[12-i][19-x] = true;
		board[13-i][19-x] = true;
		board[14-i][19-x] = true;
		board[15-i][19-x] = true;
		board[16-i][19-x] = true;
		board[17-i][19-x] = true;
		board[13-i][20-x] = true;
		board[18-i][20-x] = true;
		board[17-i][21-x] = true;
		board[18-i][21-x] = true;
		board[19-i][21-x] = true;
		return board;
		
	}
	public int getRow () {
		return rowOnBoard;
	}
	public int getCol () {
		return colOnBoard;
	}

}
