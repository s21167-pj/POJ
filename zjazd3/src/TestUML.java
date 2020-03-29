/*
Test UMLs class implemented in Java.
Author: Marcel P
 */
public class TestUML {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Account test: ");
        AccountTest();
        System.out.println("----------------------------");
        System.out.println("Date test: ");
        DateTest();
        System.out.println("----------------------------");
        System.out.println("Employee test: ");
        EmployeeTest();
        System.out.println("----------------------------");
        System.out.println("Invoice test: ");
        InvoiceTest();
        System.out.println("----------------------------");
        System.out.println("Time test: ");
        TimeTest();
        System.out.println("----------------------------");
    }

    private static void AccountTest() {
        Account someGuy = new Account("1", "wiktora", 150);
        Account anotherGuy = new Account("2", "sebastiana", 250);
        anotherGuy.credit(150);
        someGuy.debit(160);
        someGuy.debit(10);
        someGuy.transferTo(anotherGuy, 200);
        someGuy.transferTo(anotherGuy, 10);
        System.out.println(someGuy.toString());
        System.out.println(anotherGuy.toString());
    }

    private static void DateTest() {
        Date someDate = new Date(2, 2, 1996);
        Date anotherDate = new Date(10, 10, 1996);
        System.out.println(someDate.toString());
        System.out.println(anotherDate.toString());
    }

    private static void EmployeeTest() {
        Employee someEmployee = new Employee(1, "Wiktor", "Wiktorski",
                10000);
        someEmployee.getAnnualSalary();
        someEmployee.raiseSalary(10);
        System.out.println(someEmployee.toString());
    }

    private static void InvoiceTest() {
        InvoiceItem someInvoice = new InvoiceItem(1, "survive stuff", 10,
                100);
        someInvoice.getTotal();
        System.out.println(someInvoice.toString());
    }

    private static void TimeTest() {
        Time someTime = new Time(23, 59, 59);
        Time anotherTime = new Time(1, 1, 1);
        someTime.nextSecond();
        someTime.previousSecond();
        System.out.println(someTime.toString());
        System.out.println(anotherTime.toString());
    }


}

