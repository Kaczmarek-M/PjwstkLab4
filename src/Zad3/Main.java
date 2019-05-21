package Zad3;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

public class Main {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(2, 2, 4, 2, 3, 4);
        System.out.println(triangle);
        System.out.format("Obwod trojkata wynosi: " + "%.3f%n", triangle.getPerimeter());
        System.out.println(triangle.getType());
    }
}
