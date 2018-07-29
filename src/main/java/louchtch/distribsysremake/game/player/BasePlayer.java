package louchtch.distribsysremake.game.player;

import louchtch.distribsysremake.game.board.GameBoard;

public abstract class BasePlayer implements Player
{
	private PlayerHP hp;
	private BoardLocation location;
	private GameBoard gameBoard;

	public BasePlayer(GameBoard gameBoard, PlayerHP hp, BoardLocation location)
	{
		this.gameBoard = gameBoard;
		this.hp = hp;
		this.location = location;
	}

	public BoardLocation location()
	{
		return location;
	}
}
