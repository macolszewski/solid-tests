package solid.dependencyinversion;

public abstract class Board {
    private int size;

    public Board() {

    }


    public Board(int size) {
        this.size = size*size;
    }

    public int getSize() {
        return size;
    }
}
