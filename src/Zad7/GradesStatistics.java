package Zad7;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

import java.util.*;

public class GradesStatistics {
    private static List<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {
        readGrades();
        printGrades();
        System.out.format("Srednia ocen: " + "%.2f%n", average(grades));
        System.out.format("Mediana to: " + "%.2f%n", median(grades));
        System.out.println("Najlepsza ocena: " + max(grades));
        System.out.println("Najslabsza ocena to: " + min(grades));
        System.out.format("Odchylenie standardowe: " + "%.2f%n", stdDeviation(grades));
    }
    private static void readGrades(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj ilosc studentow: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("Podaj ocene studenta nr." + i + ": ");
            int grade = sc.nextInt();
            if ((grade >= 0) && (grade <= 100))
            grades.add(grade);
            else {
                System.out.println("Nieodpowiednia ocena");
                i--;
            }
        }
    }
    private static void printGrades(){
        System.out.println("Oceny to: " + grades);
    }
    private static double average(List<Integer> grades){
        double ave = 0;
        for (Integer lis : grades){
            ave += lis;
        }
        return ave / grades.size();
    }
    private static double median(List<Integer> grades){
        Collections.sort(grades);
        double med,med1,med2 ;
        if(grades.size() % 2 == 0){
            med1 = grades.get(grades.size() / 2);
            med2 = grades.get(grades.size() / 2 - 1);
            med = (med1 + med2) / 2;
        }else {
            med = grades.get(grades.size() / 2);
        }
        return med;
    }
    private static int max(List<Integer> grades) {
        int max;
        max = Collections.max(grades);
        return max;
    }
    private static int min(List<Integer> grades) {
        int min;
        min = Collections.min(grades);
        return min;
    }
    private static double stdDeviation(List<Integer> grades) {
        double variable = 0;
        double stdDev;
        for (int i = 0; i < grades.size(); i++){
            variable += (grades.get(i) - average(grades)) * (grades.get(i)- average(grades));
        }
        variable /= grades.size();
        stdDev = Math.sqrt(variable);
        return stdDev;
    }
}
