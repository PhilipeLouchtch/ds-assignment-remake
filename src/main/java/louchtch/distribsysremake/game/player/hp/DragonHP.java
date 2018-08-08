package louchtch.distribsysremake.game.player.hp;

public interface DragonHP
{
	static PlayerHP atFullHealth()
	{
		final int MAX = 100;
		return SimplePlayerHP.atFullHealth(MAX);
	}
}
