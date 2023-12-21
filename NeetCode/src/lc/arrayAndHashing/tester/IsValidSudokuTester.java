package lc.arrayAndHashing.tester;

import static lc.arrayAndHashing.core.ValidSudoku.isValidSudoku;

public class IsValidSudokuTester {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub
		char[][] board = { 
				{ '.', '.', '.', '.', '5', '.', '.', '1', '.' },
				{ '.', '4', '.', '3', '.', '.', '.', '.', '.' }, 
				{ '.', '.', '.', '.', '.', '3', '.', '.', '1' },
				{ '8', '.', '.', '.', '.', '.', '.', '2', '.' }, 
				{ '.', '.', '2', '.', '7', '.', '.', '.', '.' },
				{ '.', '1', '5', '.', '.', '.', '.', '.', '.' }, 
				{ '.', '.', '.', '.', '.', '2', '.', '.', '.' },
				{ '.', '2', '.', '9', '.', '.', '.', '.', '.' }, 
				{ '.', '.', '4', '.', '.', '.', '.', '.', '.' } };
		System.out.println("Is valid sudoku: " + isValidSudoku(board));
	}

}
