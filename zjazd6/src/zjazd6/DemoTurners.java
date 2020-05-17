package zjazd6;

/*
    Author: Marcel Pankanin  
    DemoTurners class implemented in Java
    Date: 17.05.2020
*/
public class DemoTurners {
    public static void main(String[] args) {
        Leaf someLeaf = new Leaf();
        Pancake somePancake = new Pancake();
        Page somePage = new Page();

        someLeaf.turn();
        somePancake.turn();
        somePage.turn();
    }
}
