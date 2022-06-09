package Output;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import TheSimulationFill.BoardCreator;
import TheSimulationFill.NewBoard;
import TheSimulationFill.ImpRulesOffTheGame;
import TheSimulationFill.JohnHortonRonwayRules;

public class MyPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1571040322866592542L;

	// geting classes

	ImpRulesOffTheGame oneRaunt = new JohnHortonRonwayRules();
	NewBoard newBoard = new BoardCreator();

	// Size of window
	final int PANEL_WIDTH = 1200;
	final int PANEL_HEIGHT = 700;

	// Storring info
	Image enemy;
	Timer timer;

	static int row;
	static int col;
	boolean[][] board;

	MyPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);

		row = newBoard.getRow();
		col = newBoard.getCol();

		board = new boolean[newBoard.getRow()][newBoard.getCol()];
		board = newBoard.startingBoard(board);

		enemy = new ImageIcon("pixel\\picture\\Life.png").getImage();
		timer = new Timer(1000, this);
		timer.start();
	}

	public void paint(Graphics g) {

		super.paint(g);

		Graphics2D g2D = (Graphics2D) g;

		for (int rowOnBoard = 0, printRow = 30; rowOnBoard < col; rowOnBoard++, printRow += 25) {

			for (int colOnBoard = 0, printCol = 30; colOnBoard < row; colOnBoard++, printCol += 25) {
				if (board[rowOnBoard][colOnBoard])
					g2D.drawImage(enemy, printRow, printCol, null);

			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		board = oneRaunt.whatHappenedAfterEachRound(board, row, col);

		repaint();
	}
}
