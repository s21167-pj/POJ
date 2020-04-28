/*  
    Author: Marcel Pankanin  
    Invoice class implemented in Java
    Date: 28.04.2020
*/
public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public static void main(String[] args) {
        Customer custi = new Customer(1, "custi", 10);
        Invoice inv = new Invoice(1, custi, 200);
        inv.getCustomerName();
        inv.getAmountAfterDiscount();
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAmount() {
        return String.valueOf(amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        return amount - ((getCustomer().getDiscount() / 100.0) * amount);
    }
}
