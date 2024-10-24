package lesson7;

public class Main2 {
    public static void main(String[] args) {
        Treugolnik1 abc = new Treugolnik1(10, 10, 10);
        System.out.println(abc.getC());
        abc.printPerimetr();
        abc.printPloshad();

        Pryamougolnik s1s2 = new Pryamougolnik(10, 10);
        System.out.println(s1s2.getStorona1());
        s1s2.printPerimetrPryamougolnik();
        s1s2.printPloshadPryamougolnik();

        Kvadrat storona = new Kvadrat(10);
        System.out.println(storona.getStoronaKvadrata());
        storona.printPerimetrKvadrata();
        storona.printPloshadKvadrata();

        Krug radius = new Krug(10);
        System.out.println(radius.getRadiusKruga());
        radius.printPerimetrKruga();
        radius.printPloshadKruga();

        Oval ab = new Oval(5,10);
        System.out.println(ab.getA());
        System.out.println(ab.getB());
        ab.printPerimetrOvala();
        ab.printPloshadOvala();



    }
}
