package solid.dependencyinversion;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }
}
