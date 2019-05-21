package Zad6;

// Michal Kaczmarek s18464
// Adrian Witkowski s19439

public class ChemicalElement {
    private String name;
    private String symbolicName;
    private int atomicNumber;

    public static final ChemicalElement HYDROGEN = new ChemicalElement("Hydrogen", "H (hydrogenium): ", 1);
    public static final ChemicalElement OXYGEN = new ChemicalElement("Oxygen", "O (oxygenium): ", 8);
    public static final ChemicalElement POTASSIUM = new ChemicalElement("Potassium", "K (kalium): ", 19);
    public static final ChemicalElement ZINC = new ChemicalElement("Zinc", "Zn: ", 30);
    public static final ChemicalElement GALLIUM = new ChemicalElement("Gallium", "Ga: ", 31);

    public ChemicalElement(String name, String symbolicName, int atomicNumber) {
        this.name = name;
        this.symbolicName = symbolicName;
        this.atomicNumber = atomicNumber;
    }

    public String getSymbolicName() {
        return symbolicName;
    }

    public String getName() {
        return name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public boolean isMetal() {
        boolean metal = false;
        if ((atomicNumber == 13) || (atomicNumber == 31) || (atomicNumber >= 49 && atomicNumber <= 50) || (atomicNumber >= 81 && atomicNumber <= 83) ||
                (atomicNumber >= 113 && atomicNumber <= 116)) {
            metal = true;
        }
        return metal;
    }

    public boolean alkaliMetal() {
        boolean alkaliMetal = false;
        switch (atomicNumber) {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 85:
                alkaliMetal = true;
        }
        return alkaliMetal;
    }

    public boolean isTransistionMetal() {
        return 21 <= atomicNumber && atomicNumber <= 30
                || 39 <= atomicNumber && atomicNumber <= 48
                || 72 <= atomicNumber && atomicNumber <= 80;
    }

    @Override
    public String toString() {
        return "ChemicalElement{" +
                "name='" + name + '\'' +
                ", symbolicName='" + symbolicName + '\'' +
                ", atomicNumber=" + atomicNumber +
                '}';
    }

    public String getAnswerAlkali() {
        String ans;
        if (alkaliMetal()) {
            ans = " It is an alkali metal.";
        } else {
            ans = " It is not an alkali metal.";
        }
        return ans;
    }

    public String getAnswerTransistion() {
        String ans;
        if (isTransistionMetal()) {
            ans = " It is a transition metal.";
        } else {
            ans = " It is not a transition metal.";
        }
        return ans;
    }

    public String getAnswerMetal() {
        String ans;
        if (isMetal()) {
            ans = " It is a metal.";
        } else {
            ans = " It is not metal.";
        }
        return ans;
    }
}