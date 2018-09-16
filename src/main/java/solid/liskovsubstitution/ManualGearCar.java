package solid.liskovsubstitution;

public class ManualGearCar implements GearCar {
    GearType gearType;

    @Override
    public void drive() {
        System.out.println("Jadę!");

    }

    @Override
    public void changeGear(GearType gearType) {
        System.out.print(this.toString());
        this.gearType = gearType;
        System.out.printf("Zmieniam bieg na: %s", this.gearType.toString());
        System.out.println();
    }

    @Override
    public String toString() {
        return "ManualGearCar: ";
    }
}
