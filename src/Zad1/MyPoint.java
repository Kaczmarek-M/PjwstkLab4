package Zad1;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

import java.util.ArrayList;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Integer> getXY() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, getX());
        list.add(1, getY());
        return list;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        int xR = this.x - x;
        int yR = this.y - y;
        return Math.sqrt(xR * xR + yR * yR);
    }

    public double distance(MyPoint another) {
        int xR = this.x - another.x;
        int yR = this.y - another.y;
        return Math.sqrt(xR * xR + yR * yR);

    }

    public double distance() {
        int xR = this.x;
        int yR = this.y;
        return Math.sqrt(xR * xR + yR * yR);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
