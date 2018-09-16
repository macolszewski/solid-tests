package solid.dependencyinversion;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void drawBoard() {
        int a = (int) Math.sqrt(board.getSize());
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("▢ ");
                if (j == a-1) {
                    System.out.println();
                }

            }

        }

    }
}
