package louchtch.distribsysremake.game.player;

import louchtch.distribsysremake.game.board.Coordinate;

import java.util.HashMap;
import java.util.Optional;

public class BoardSquare
{
	private Optional<PlacedPlayer> playerOnLocation;
	private Coordinate associatedLocation;

	private BoardSquare(Optional<PlacedPlayer> playerOnLocation, Coordinate associatedLocation)
	{
		this.playerOnLocation = playerOnLocation;
		this.associatedLocation = associatedLocation;
	}

	private static HashMap<Coordinate, BoardSquare> squares = new HashMap<>();
	public static BoardSquare of(Coordinate coordinate)
	{
		return squares.computeIfAbsent(coordinate,
				arg -> new BoardSquare(Optional.empty(), coordinate)
		);
	}

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

	public PlacedPlayer place(Player player)
	{
		if (playerOnLocation.isPresent())
		{
			throw new RuntimeException("Cannot place player {}: square already occupied");
		}
		else
		{
			playerOnLocation = Optional.of(player);
		}
	}
}
