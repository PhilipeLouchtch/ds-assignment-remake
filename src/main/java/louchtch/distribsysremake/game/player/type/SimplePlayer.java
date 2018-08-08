package louchtch.distribsysremake.game.player.type;

import louchtch.distribsysremake.game.board.GameBoard;
import louchtch.distribsysremake.game.player.BoardSquare;
import louchtch.distribsysremake.game.player.Player;
import louchtch.distribsysremake.game.player.hp.PlayerHP;

class SimplePlayer implements Player
{
	private PlayerHP health;
	private GameBoard gameBoard; // todo: remove? Add neighbours to boardsquare?
	private BoardSquare boardSquare;

	SimplePlayer(GameBoard gameBoard, PlayerHP health)
	{
		this.gameBoard = gameBoard;
		this.health = health;
	}

	@Override
	public PlayerHP health()
	{
		return health;
	}

	@Override
	public boolean dead()
	{
		return health().depleted();
	}

	public void place(BoardSquare boardSquare)
	{
		this.boardSquare = boardSquare;
		this.boardSquare.place(this);
	}

}
