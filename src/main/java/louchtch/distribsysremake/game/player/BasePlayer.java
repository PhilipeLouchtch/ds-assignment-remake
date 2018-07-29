package louchtch.distribsysremake.game.player;

import louchtch.distribsysremake.game.board.GameBoard;

public abstract class BasePlayer implements Player
{
	private PlayerHP hp;
	private BoardSquare location;
	private GameBoard gameBoard;

	public BasePlayer(GameBoard gameBoard, PlayerHP hp, BoardSquare location)
	{
		this.gameBoard = gameBoard;
		this.hp = hp;
		this.location = location;
	}

	public BoardSquare location()
	{
		return location;
	}
}
