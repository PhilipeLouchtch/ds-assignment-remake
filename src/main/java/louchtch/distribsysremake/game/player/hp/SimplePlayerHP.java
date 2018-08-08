package louchtch.distribsysremake.game.player.hp;

import louchtch.distribsysremake.game.player.Damage;

public class SimplePlayerHP implements PlayerHP
{
	private int current;
	private int max;

	private SimplePlayerHP(int current, int max)
	{
		this.current = current;
		this.max = max;
	}

	static PlayerHP atFullHealth(int max)
	{
		return new SimplePlayerHP(max, max);
	}

	@Override
	public int current()
	{
		return current;
	}

	@Override
	public int max()
	{
		return max;
	}

	@Override
	public boolean depleted()
	{
		return current <= 0;
	}

	@Override
	public PlayerHP incur(Damage damage)
	{
		return new SimplePlayerHP(current - damage.amount(), max);
	}
}
