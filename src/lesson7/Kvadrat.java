package lesson7;

public class Kvadrat {
    private int storonaKvadrata;

    public Kvadrat() {
    }

    public Kvadrat(int storonaKvadrata) {
        this.storonaKvadrata = storonaKvadrata;
    }

    public int getStoronaKvadrata() {
        return storonaKvadrata;
    }

    public void setStoronaKvadrata(int storonaKvadrata) {
        this.storonaKvadrata = storonaKvadrata;
    }

    public void printPerimetrKvadrata() {
        System.out.println(storonaKvadrata * 4);
    }
    public void printPloshadKvadrata(){
        System.out.println(storonaKvadrata * storonaKvadrata);
    }
}

