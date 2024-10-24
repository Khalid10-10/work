package lesson7;

public class Pryamougolnik {
    private int storona1;
    private int storona2;

    public Pryamougolnik() {
    }

    public Pryamougolnik(int storona1, int storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    public int getStorona1() {
        return storona1;
    }

    public void setStorona1(int storona1) {
        this.storona1 = storona1;
    }

    public int getStorona2() {
        return storona2;
    }

    public void setStorona2(int storona2) {
        this.storona2 = storona2;
    }

    public void printPerimetrPryamougolnik() {
        System.out.println(storona1 + storona1 + storona2 + storona2);
    }

    public void printPloshadPryamougolnik() {
        System.out.println(storona1 * storona2);
    }
}
