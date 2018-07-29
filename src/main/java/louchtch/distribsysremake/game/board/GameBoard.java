package louchtch.distribsysremake.game.board;

import louchtch.distribsysremake.game.player.BoardSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GameBoard
{
	BoardSquare[][] boardSquares;

	public Collection<BoardSquare> unoccupiedSquares()
	{
		Predicate<BoardSquare> squareIsUnoccupied = ((Predicate<BoardSquare>) BoardSquare::isOccupied).negate();

		return Arrays.stream(boardSquares).flatMap(Arrays::stream)
				.filter(squareIsUnoccupied)
				.collect(Collectors.toUnmodifiableList());
	}
}