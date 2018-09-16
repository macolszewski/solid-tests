package solid.interfacesegregation.exercise;

public abstract class PizzaHutTakeawayAbstract implements TakeawayAPI {
    @Override
    public void acceptOnlineOrder() {
        System.out.println("zamowienie online");

    }

    @Override
    public void takeawayPizza() {
        System.out.println("Biorę na zewnątrz sobie kawał pizzy");

    }

    @Override
    public void takeTelephoneOrder() {
        System.out.println("zamawiam telefonicznie");

    }

    @Override
    public void payOnline() {
        System.out.println("płacę w środku");

    }

    @Override
    public void walkInCustomerOrder() {
        System.out.println("zamówienie w restaturacji przy takeaway");

    }

    @Override
    public void payInPerson() {
        System.out.println("płatność przy takeaway");

    }
}
