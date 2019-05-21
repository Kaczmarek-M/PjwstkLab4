package Zad5;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
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
        double amountTemp;
        double sumDiscount;
        amountTemp = amount / 100;
        sumDiscount = amountTemp * customer.getDiscount();
        return amount - sumDiscount;
    }
}
