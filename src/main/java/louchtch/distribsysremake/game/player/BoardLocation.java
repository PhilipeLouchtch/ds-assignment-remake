package louchtch.distribsysremake.game.player;

import java.util.Optional;

public class BoardLocation
{
	private Optional<Player> playerOnLocation;

	public boolean isOccupied()
	{
		return !playerOnLocation.isPresent();
	}

	public Player player()
	{
		return playerOnLocation.orElseThrow(
				() -> new RuntimeException("Attempt to get player from board location that does not have a player")
		);
	}
}
