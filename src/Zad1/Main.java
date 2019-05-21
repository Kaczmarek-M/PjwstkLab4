package Zad1;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x1, y1;
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(4, 7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x1");
        x1 = scanner.nextInt();
        System.out.println("Podaj y1");
        y1 = scanner.nextInt();
        point1.setXY(x1, y1);

        System.out.println("Wspolzedne pierwszego punktu: " + point1);
        System.out.println("Wspolzedne dugiego punktu: " + point2 + "\n");
        System.out.println("Dystans pomiedzy pierwszym punktem a punktem (5 , 9): " + point1.distance(5, 9));
        System.out.println("Dystans pomiedzy pierszym punktem a drugim: " + point1.distance(point2));
        System.out.println("Dystans pomiedzy drugim a pierwszym punktem: " + point2.distance(point1));
        System.out.println("Dystans pomiedzy pierwszym punktem a punktem(0 , 0): " + point1.distance());

    }
}
