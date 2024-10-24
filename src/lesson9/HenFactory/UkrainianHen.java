package lesson9.HenFactory;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 55;
    }
    public String getDescription(){
        return super.getDescription() + "Моя страна - Украина. Я несу " + 55 + " яиц в месяц.";
    }
}
