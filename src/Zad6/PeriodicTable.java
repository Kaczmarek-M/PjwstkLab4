package Zad6;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PeriodicTable {
    private ChemicalElement[][] chemicalElements = new ChemicalElement[8][24];

    private static final String PeriodicFileName = "C:\\Users\\natas\\Java_Studia\\MojeProjekty\\Zajecia_Lab5\\src\\Zad6\\periodensystem.csv";
    private static PeriodicTable periodicTable = new PeriodicTable();

    public static PeriodicTable getPeriodicTable() {
        return periodicTable;
    }

    private PeriodicTable() {
        try {
            loadChemicalElements();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadChemicalElements() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(PeriodicFileName));

            while (bufferedReader.ready()) {
                String element = bufferedReader.readLine();
                String[] elementValues = element.split(",");
                chemicalElements[Integer.valueOf(elementValues[4])][Integer.valueOf(elementValues[3])]
                        = new ChemicalElement(elementValues[1],elementValues[2], Integer.valueOf(elementValues[0]));
            }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }

    public ChemicalElement getChemicalElement(int period,int group) {
        return chemicalElements[period][group];
    }
}
