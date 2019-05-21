package Zad5;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

public class Main {
    public static void main(String[] args) {
        Customer Michal = new Customer(1,"Michal",10);
        Invoice invoice = new Invoice(10,Michal,120);
        invoice.setCustomer(Michal);
        Michal.setDiscount(10);
        invoice.setAmount(1250);
        System.out.println(Michal);
        System.out.println("Cena: " + invoice.getAmount());
        System.out.println("Znizka: " + Michal.getDiscount()+ "%");
        System.out.format("Cena po znizce: " + "%.2f%n",invoice.getAmountAfterDiscount());
        System.out.println("Numer faktury: " + invoice.getID());
        System.out.println("Imie: " + invoice.getCustomerName());System.out.println();
        invoice.setCustomer(Michal);
    }
}
