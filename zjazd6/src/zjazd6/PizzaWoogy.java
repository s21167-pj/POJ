package zjazd6;

/*
    Author: Marcel Pankanin  
    PizzaWoogy class implemented in Java
    Date: 25.05.2020
*/
public class PizzaWoogy extends Pizza {

    private int size;
    private boolean isPizzaBottomCrispy;
    private String additionalIngredient;

    public PizzaWoogy(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaWoogy(double calories, String name, double price, int size,
                      boolean isPizzaBottomCrispy, String additionalIngredient) {
        super(calories, name, price);
        this.size = size;
        this.isPizzaBottomCrispy = isPizzaBottomCrispy;
        this.additionalIngredient = additionalIngredient;
    }

    public int getSize() {
        return size;
    }

    public boolean isPizzaBottomCrispy() {
        return isPizzaBottomCrispy;
    }

    public String getAdditionalIngredient() {
        return additionalIngredient;
    }
}
