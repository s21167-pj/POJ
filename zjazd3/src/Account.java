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
            System.out.println("Amount you want to withdraw exceeded balance");
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            another.balance = another.balance + amount;
        } else
            System.out.println("You can't transfer more than you have");
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


}
