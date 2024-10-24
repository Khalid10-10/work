package lesson9.HenFactory;

public class HenFactory {
    public Hen getHen(String country){
        Hen hen = null;
        switch (country){
            case "Россия":
                return new RussianHen();
            case "Украина":
                return new UkrainianHen();
            case "Белоруссия":
                return new BelarusianHen();
            case "Молдова":
                return new MoldovanHen();
        }
        return hen;


    }
}
