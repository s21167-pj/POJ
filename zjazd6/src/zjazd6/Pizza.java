package zjazd6;

/*
    Author: Marcel Pankanin  
    Pizza class implemented in Java
    Date: 25.05.2020
*/
public class Pizza implements Comparable {
    private double calories;
    private String name;
    private double price;

    public Pizza(double calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza[" +
                ", name='" + name + '\'' +
                ", price=" + price +
                " calories=" + calories +
                ']';
    }

    @Override
    public int compareTo(Object o) {
        return new Double(price).compareTo(((Pizza) o).getPrice());
    }
}
