package solid.interfacesegregation.exercise;

public interface TakeawayAPI extends OnlineAPI, RestaurantAPI {
    @Override
    void acceptOnlineOrder();

    void takeawayPizza();

    void takeTelephoneOrder();

    @Override
    void payOnline();

    void payInPerson();

    @Override
    void walkInCustomerOrder();
}
