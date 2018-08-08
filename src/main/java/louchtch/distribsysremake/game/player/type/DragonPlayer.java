package louchtch.distribsysremake.game.player.type;

import louchtch.distribsysremake.game.board.GameBoard;
import louchtch.distribsysremake.game.player.Player;
import louchtch.distribsysremake.game.player.hp.DragonHP;
import louchtch.distribsysremake.game.player.hp.PlayerHP;

public interface DragonPlayer
{
	public static Player newDragon(GameBoard gameBoard)
	{
		PlayerHP playerHP = DragonHP.atFullHealth();
		Player player = new SimplePlayer(gameBoard, playerHP);

		return player;
	}
}
