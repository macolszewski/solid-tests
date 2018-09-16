package solid.interfacesegregation.exercise;

public class PizzaHutRestaurant implements RestaurantAPI {
    @Override
    public void payInPerson() {
        System.out.println("płacę w środku");
    }

    @Override
    public void walkInCustomerOrder() {
        System.out.println("zamówienie w środku");

    }
}
