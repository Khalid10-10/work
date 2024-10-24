package lesson10.blackJack;

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        BlackJack blackJack = new BlackJack();

        Player vasya = new Player("Василий");
        Player petya = new Player("Petr");
        Player kolya = new Player("Николай");

        blackJack.addPlayerToGame(vasya);
        blackJack.addPlayerToGame(petya);
        blackJack.addPlayerToGame(kolya);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayers(); // всем по 2 карты
        blackJack.dealRestCardsToAllPlayers(); // раздаем оствшиеся карты
        blackJack.printWinner();
    }
}
