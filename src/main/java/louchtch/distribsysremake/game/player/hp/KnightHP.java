package louchtch.distribsysremake.game.player.hp;

public interface KnightHP
{
	static PlayerHP atFullHealth()
	{
		final int MAX = 15;
		return SimplePlayerHP.atFullHealth(MAX);
	}
}
