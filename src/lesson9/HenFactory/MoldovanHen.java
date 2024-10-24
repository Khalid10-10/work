package lesson9.HenFactory;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 37;
    }
    public String getDescription(){
        return super.getDescription() + "Моя страна - Молдова. Я несу " + 37 + " яиц в месяц.";
    }
}
