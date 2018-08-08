package louchtch.distribsysremake.game.player.hp;

import louchtch.distribsysremake.game.player.Damage;

public interface PlayerHP
{
	int current();
	int max();

	/**
	 * Incurs the given damage and builds an updated PlayerHP
	 * @param damage The {@code Damage} that the PlayerHP must incur
	 * @return a (new) {@code PlayerHP} instance that reflects the incurred damage
	 */
	PlayerHP incur(Damage damage);

	boolean depleted();
}
