package zjazd6;

/*
    Author: Marcel Pankanin  
    ResizableCircle class implemented in Java
    Date: 17.05.2020
*/
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
