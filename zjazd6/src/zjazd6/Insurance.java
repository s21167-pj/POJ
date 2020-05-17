package zjazd6;

/*
    Author: Marcel Pankanin  
    Insurance abstract class implemented in Java
    Date: 17.05.2020
*/
abstract class Insurance {
    public String type;
    public double pricePerMonth;

    public Insurance(String type) {
        this.type = type;
    }

    public abstract void setCost();

    public abstract void display();

    public String getType() {
        return type;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }
}
