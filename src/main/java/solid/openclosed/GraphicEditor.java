package solid.openclosed;

public class GraphicEditor<T extends Drawable> {

    public void build(Drawable drawable){
        drawable.draw();
    }
}
