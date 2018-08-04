package louchtch.distribsysremake.game;

import louchtch.distribsysremake.game.board.GameBoard;

public class God
{
	public static Game createNewGame()
	{
		int boardDimension = 25;
		var gameBoard = GameBoard.freshEmptyBoard(boardDimension);

		return new Game(gameBoard);
	}
}
