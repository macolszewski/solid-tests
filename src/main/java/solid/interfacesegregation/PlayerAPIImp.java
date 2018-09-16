package solid.interfacesegregation;

public class PlayerAPIImp extends PlayerAPIAbst {

    @Override
    public void play() {
        System.out.println("Play");

    }

    @Override
    public void pause() {
        System.out.println("Pause");

    }


}
