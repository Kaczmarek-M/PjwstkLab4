package Zad6;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scanner(System.in);
        int period;
        int group;
        System.out.println(ChemicalElement.HYDROGEN.getSymbolicName() + ChemicalElement.HYDROGEN.getName() + " with atomic number " +
                ChemicalElement.HYDROGEN.getAtomicNumber() + ".");
        System.out.println(ChemicalElement.OXYGEN.getSymbolicName() + ChemicalElement.OXYGEN.getName() + " with atomic number " +
                ChemicalElement.OXYGEN.getAtomicNumber() + ".");
        System.out.print(ChemicalElement.POTASSIUM.getSymbolicName() + ChemicalElement.POTASSIUM.getName() + " with atomic number " +
                ChemicalElement.POTASSIUM.getAtomicNumber() + ".");
        System.out.println(ChemicalElement.POTASSIUM.getAnswerAlkali());
        System.out.print(ChemicalElement.ZINC.getSymbolicName() + ChemicalElement.ZINC.getName() + " with atomic number " +
                ChemicalElement.ZINC.getAtomicNumber() + ".");
        System.out.println(ChemicalElement.ZINC.getAnswerTransistion());
        System.out.print(ChemicalElement.GALLIUM.getSymbolicName() + ChemicalElement.GALLIUM.getName() + " with atomic number " +
                ChemicalElement.GALLIUM.getAtomicNumber());
        System.out.println(ChemicalElement.GALLIUM.getAnswerMetal() + "\n");
        for (int i = 0; i < 1; i++) {
            System.out.println("enter the element period  (1-7)");
            period = sc.nextInt();
            System.out.println("enter the element group   (1-18)");
            group = sc.nextInt();
            try {
                System.out.println(PeriodicTable.getPeriodicTable().getChemicalElement(period, group));
                System.out.println(PeriodicTable.getPeriodicTable().getChemicalElement(period, group).getAnswerMetal());

            } catch (NullPointerException e) {
                System.out.println("Incorrect data");
                i--;
            }
        }
    }
}