package com.TicTakToe;

public class TicTacToe {
	public static void main(String args[]) {

		// Objection creation
		TicTacToe ticTakToe = new TicTacToe();
		ticTakToe.createBoard();

	}

	public char[] createBoard() // Creating a board method
	{
		// creating a array and set array size 10
		char[] board = new char[10];
		// iterating from 1 to 9
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';// initializing empty spaces to board index
		}
		System.out.println(" Board Created ");
		return board;

	}
}
