package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() { //somente classes do mesmo pacote e subclasses podem acessar
		return board;
	}
}
