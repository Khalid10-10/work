package lesson9.HenFactory;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 57;
    }
    public String getDescription(){
        return super.getDescription() + "Моя страна - Белоруссия. Я несу " + 57 + " яиц в месяц.";
    }
}
