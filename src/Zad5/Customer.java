package Zad5;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

public class Customer {
    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public int getDiscount(){
        return discount;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                '}';
    }
}
