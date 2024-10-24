package lesson7;

public class Treugolnik1 {
    private int a;
    private int b;
    private int c;

    public Treugolnik1() {
    }

    public Treugolnik1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void printPerimetr() {
        System.out.println(a + b + c);
    }

    public void printPloshad() {
        double semiper = (a + b + c) / 2;
        double ploshad = Math.sqrt(semiper * (semiper - a) * (semiper - b) * (semiper - c));
        System.out.println(ploshad);
    }
}


