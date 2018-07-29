package louchtch.distribsysremake.game;

import louchtch.distribsysremake.game.board.GameBoard;

public class Game
{
	private GameBoard gameBoard;
	// ... things related to the game itself but not part of already present concepts

	public Game(GameBoard gameBoard)
	{
		this.gameBoard = gameBoard;
	}
}
