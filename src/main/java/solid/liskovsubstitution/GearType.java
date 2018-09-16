package solid.liskovsubstitution;

public enum GearType {
    R("Wsteczny"),
    N("Jałowy"),
    FIRST("Pierwszy"),
    SECOND("Drugi"),
    THIRD("Trzeci"),
    FORTH("Czwarty"),
    FIFTH("Piąty");

    private final String bieg;

    private GearType(String bieg) {
        this.bieg = bieg;
    }

    @Override
    public String toString() {
        return this.bieg;
    }
}
