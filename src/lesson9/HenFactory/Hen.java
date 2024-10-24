package lesson9.HenFactory;

public abstract class Hen {

    public Hen() {
    }
public abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я курица";
    }
}
