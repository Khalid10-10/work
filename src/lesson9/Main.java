package lesson9;

public class Main {
    public static void main(String[] args) {
        Tsvetok tsvetok1 = new Tsvetok();
        Tsvetok tsvetok2 = new Tsvetok();
        Derevo derevo1 = new Derevo();
        Derevo derevo2 = new Derevo();

        Rastenie[] sad = new Rastenie[4];
        sad[0] = derevo1;
        sad[1] = tsvetok1;
        sad[2] = tsvetok2;
        sad[3] = derevo2;

        for(Rastenie r:sad){
            r.printInfo();


        }

    }
}
