package solid.liskovsubstitution;

public class AutomaticGearCar implements GearCar {

    @Override
    public void drive() {
        System.out.println("Jadę!");

    }

    @Override
    public void changeGear(GearType gearType) {
        System.out.print(this.toString());
        if (gearType.equals(GearType.R)) {
            System.out.printf("Zmieniam bieg na: %s", gearType.toString());
        } else if (gearType.equals(GearType.N)) {
            System.out.printf("Zmieniam bieg na: %s", gearType.toString());
        } else {
            System.out.print("Nie robię nic!");
        }
        System.out.println();

    }

    @Override
    public String toString() {
        return "AutomaticGearCar: ";
    }
}
