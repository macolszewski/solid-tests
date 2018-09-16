package solid.interfacesegregation.exercise;

public class PizzaHutMobileApp implements OnlineAPI {
    @Override
    public void acceptOnlineOrder() {
        System.out.println("akceptuje zamówienie online");
    }

    @Override
    public void payOnline() {
        System.out.println("płacę online");

    }
}
