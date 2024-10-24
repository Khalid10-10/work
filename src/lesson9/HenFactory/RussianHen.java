package lesson9.HenFactory;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 49;
    }
    public String getDescription(){
        return super.getDescription() + "Моя страна - Россия. Я несу " + 49 + " яиц в месяц.";
    }
}
