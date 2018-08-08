package louchtch.distribsysremake.game.player;

import louchtch.distribsysremake.game.player.hp.PlayerHP;

public interface Player
{
	PlayerHP health();
	boolean dead();
}
