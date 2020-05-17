package zjazd6;

/*
    Author: Marcel Pankanin  
    Life class implemented in Java
    Date: 17.05.2020
*/
class Life extends Insurance {
    public Life(String type) {
        super(type);
        setCost();
    }

    @Override
    public void setCost() {
        this.pricePerMonth = 36;
    }

    @Override
    public void display() {
        System.out.printf("Your insurance type is : %s\n your monthly cost is : %.2f\n", type, pricePerMonth);
    }
}
