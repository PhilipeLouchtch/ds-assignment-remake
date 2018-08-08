package louchtch.distribsysremake.game.player.type;

import louchtch.distribsysremake.game.board.GameBoard;
import louchtch.distribsysremake.game.player.Player;
import louchtch.distribsysremake.game.player.hp.KnightHP;
import louchtch.distribsysremake.game.player.hp.PlayerHP;

public interface KnightPlayer
{
	public static Player newKnight(GameBoard gameBoard)
	{
		PlayerHP playerHP = KnightHP.atFullHealth();
		Player player = new SimplePlayer(gameBoard, playerHP);

		return player;
	}
}
