/*  
    Author: Marcel Pankanin  
    Customer class implemented in Java
    Date: 28.04.2020
*/
public class Customer {
    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public static void main(String[] args) {
        //Customer custi = new Customer(1,"custi",10);
        // System.out.println(custi.toString());
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return '"' +
                name + "(" +
                ID + ")" +
                '"';
    }
}
