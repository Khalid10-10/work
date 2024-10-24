package lesson10.blackJack;

public class Dealer extends Player {

    public Dealer() {
        super("КРУПЬЕ");
    }

    @Override
    public boolean needMoreCard() {
        if (countBallsInHand() < 17) {
            return true;

        }
        return false;
    }
}
