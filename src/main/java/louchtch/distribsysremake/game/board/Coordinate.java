package louchtch.distribsysremake.game.board;

public class Coordinate
{
	private int x;
	private int y;

	private Coordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public static Coordinate at(int x, int y)
	{
		return new Coordinate(x, y);
	}

	public int x()
	{
		return x;
	}

	public int y()
	{
		return y;
	}
}
