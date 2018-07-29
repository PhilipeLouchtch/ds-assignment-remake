package louchtch.distribsysremake.game.board;

import louchtch.distribsysremake.game.player.BoardLocation;

import java.util.ArrayList;
import java.util.Collection;

public class GameBoard
{
	BoardLocation[][] playersOnBoard;

	public Collection<BoardLocation> unoccupiedLocations()
	{
		var emptyLocations = new ArrayList<BoardLocation>();

		for (var row : playersOnBoard)
		{
			for (var boardLocation : row)
			{
				if (boardLocation.isOccupied())
				{
					emptyLocations.add(boardLocation);
				}
			}
		}

		return emptyLocations;
	}
}
