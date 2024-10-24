package lesson7;

public class Oval {
    private int a;
    private int b;

    public Oval() {
    }

    public Oval(int a, int b) {
        this.a = a;
        this.b = b;
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

    public void printPerimetrOvala() {
        System.out.println(2 * Math.PI * Math.sqrt(((a * a) + (b * b)) / 2));
    }

    public void printPloshadOvala() {
        System.out.println(Math.PI * a * b);
    }
}
