package solid.interfacesegregation.exercise;

public interface TakeawayAPI extends OnlineAPI, RestaurantAPI{
    @Override
    void acceptOnlineOrder();
    public void takeawayPizza();
    public void takeTelephoneOrder();

    @Override
    void payOnline();

    @Override
    void payInPerson();

    @Override
    void walkInCustomerOrder();
}
