/*
Account UML chart implemented in Java.
Author: Marcel P
 */
public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance = balance + amount;
    }

    public int debit(int amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance)
            balance = balance - amount;
        another.balance += another.balance + amount;
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account kuba = new Account("1", "kubowe", 100);
        Account bartek = new Account("2", "bartkowe", 50);

        kuba.credit(1500);
        bartek.debit(50);
        kuba.transferTo(bartek, 1);
    }

}
