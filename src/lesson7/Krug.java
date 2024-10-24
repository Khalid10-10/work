package lesson7;

public class Krug {
    private int radiusKruga;

    public Krug() {
    }

    public Krug(int radiusKruga) {
        this.radiusKruga = radiusKruga;
    }

    public int getRadiusKruga() {
        return radiusKruga;
    }

    public void setRadiusKruga(int radiusKruga) {
        this.radiusKruga = radiusKruga;
    }

    public void printPerimetrKruga() {
        System.out.println((radiusKruga * Math.PI) * 2);
    }

    public void printPloshadKruga() {
        System.out.println((radiusKruga * radiusKruga) * Math.PI);
    }
}
