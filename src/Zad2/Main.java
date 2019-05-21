package Zad2;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

public class Main {
    public static void main(String[] args) {
        MyCircle firstC = new MyCircle();
        MyCircle secondC = new MyCircle();
        MyCircle thirdC = new MyCircle(1, 3, 3);
        MyCircle fourthC = new MyCircle();

        System.out.println(firstC);
        firstC.setCenterX(8);
        firstC.setCenterY(2);
        System.out.println("x= " + firstC.getCenterX());
        System.out.println("y= " + firstC.getCenterY());
        secondC.setCenterXY(2, 5);
        System.out.println("x= " + secondC.getCenterXY().get(0));
        System.out.println("y= " + secondC.getCenterXY().get(1));
        System.out.println("Powierzchnia okregu wynosi: " + thirdC.getArea());
        System.out.println("Obwod okregu wynosi: " + firstC.getCircumference());
        System.out.println("Dystans miedzy punktami: " + firstC.distance(secondC));
        fourthC.setRadius(3);
        System.out.println(fourthC.getRadius());
    }
}
