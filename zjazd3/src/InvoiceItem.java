/*
Invoice UML chart implemented in Java.
Author: Marcel P
 */
public class InvoiceItem {
    private int id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(int id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        double total = unitPrice * qty;
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public static void main(String[] args) {
    InvoiceItem maciek = new InvoiceItem(1, "balony", 50000, 2.50);
    maciek.getTotal();

    }
}
