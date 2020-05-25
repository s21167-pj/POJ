package zjazd6;

/*
    Author: Marcel Pankanin  
    Health class implemented in Java
    Date: 17.05.2020
*/
class Health extends Insurance {

    public Health() {
        super("Health");
        setCost();
    }

    @Override
    public void setCost() {
        this.pricePerMonth = 196;
    }

    @Override
    public void display() {
        System.out.printf("Your insurance type is : %s\n your monthly cost is : %.2f\n", type, pricePerMonth);
    }
}
