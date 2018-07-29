package louchtch.distribsysremake.game;

import louchtch.distribsysremake.game.board.GameBoard;

public class God
{
	public static Game createNewGame()
	{
		var gameBoard = new GameBoard();

		return new Game(null);
	}
}
