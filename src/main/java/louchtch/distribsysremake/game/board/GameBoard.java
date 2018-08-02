package louchtch.distribsysremake.game.board;

import louchtch.distribsysremake.game.player.BoardSquare;
import louchtch.distribsysremake.game.player.Player;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;

public class GameBoard
{
	/* TODO: use some Collection type rather than Array.
	 * The location info is encoded in the Square, therefore need to prevent double-bookkeeping
	 */
	private BoardSquare[][] boardSquares;

	private GameBoard(BoardSquare[][] boardSquares)
	{
		this.boardSquares = boardSquares;
	}

	public static GameBoard freshEmptyBoard(int dimension)
	{
		BoardSquare[][] boardSquares = new BoardSquare[dimension][dimension];

		// Init the Squares
		for (int i = 0; i < dimension; i++)
		{
			for (int j = 0; j < dimension; j++)
			{
				boardSquares[j][i] = BoardSquare.of(Coordinate.at(j, i));
			}
		}

		return new GameBoard(boardSquares);
	}

	public Collection<BoardSquare> unoccupiedSquares()
	{
		Predicate<BoardSquare> squareIsUnoccupied = ((Predicate<BoardSquare>) BoardSquare::occupied).negate();

		return Arrays.stream(boardSquares).flatMap(Arrays::stream)
				.filter(squareIsUnoccupied)
				.collect(toUnmodifiableList());
	}

	/**
	 * Places the player on a random location on the GameBoard
	 * @param player The player to place
	 */
	public void place(Player player)
	{
		Collection<BoardSquare> boardSquares = unoccupiedSquares();

		BoardSquare randomEmptySquare = boardSquares.stream().skip(new Random().nextInt(boardSquares.size()))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Cannot place player {} on board: no unoccupied locations found"));

		randomEmptySquare.place(player);
	}
}