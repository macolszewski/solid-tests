package solid.interfacesegregation.exercise;

public class PizzaHutTakeaway extends PizzaHutTakeawayAbstract {
    @Override
    public void takeawayPizza() {
        super.takeawayPizza();
    }

    @Override
    public void takeTelephoneOrder() {
        super.takeTelephoneOrder();
    }

    @Override
    public void walkInCustomerOrder() {
        super.walkInCustomerOrder();
    }

    @Override
    public void acceptOnlineOrder() {
        super.acceptOnlineOrder();
    }

    @Override
    public void payOnline() {
        super.payOnline();
    }

    @Override
    public void payInPerson() {
        super.payInPerson();
    }
}
