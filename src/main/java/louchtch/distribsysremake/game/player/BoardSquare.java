package louchtch.distribsysremake.game.player;

import java.util.Optional;

public class BoardSquare
{
	private Optional<Player> playerOnLocation;
	private Coordinate associatedLocation;

	public boolean occupied()
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
