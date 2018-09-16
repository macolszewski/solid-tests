package solid.dependencyinversion;

public abstract class Board {
    private int size;

    public Board() {

    }

    public Board(int size) {
        this.size = size * size;
    }

    public int getSize() {
        return size;
    }

    public void drawBoard() {
        int a = (int) Math.sqrt(this.getSize());
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
