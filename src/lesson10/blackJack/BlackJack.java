package lesson10.blackJack;

public class BlackJack {
    private Koloda koloda = new Koloda();
    private Player[] players = new Player[9];

    public BlackJack() {
        koloda.createKoloda();
    }


    public void addPlayerToGame(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                break;
            }
        }
    }

    public void dealTwoCardsToAllPlayers() {
        for (Player p : players) {
            if (p != null) {
                p.addCardToHand(koloda.rundomCard());
                p.addCardToHand(koloda.rundomCard());

            }

        }

    }

    public void dealRestCardsToAllPlayers() {
        for (Player p : players) {
            if (p != null) {
                // узнаем нужна ли карта, если нужна даем ее
                // и так по кругу, пока не скажет НЕТ
                while (p.needMoreCard()) { // метод должен вернуть true или false
                    p.addCardToHand(koloda.rundomCard());

                }
            }

        }
    }

    public void printWinner() {
        // выключаем игроков у которых перебор
        for (Player p: players) {
            if (p != null && p.countBallsInHand() > 21) {
                p.setInGame(false); // выключили игрока у которого перебор карт
            }
        }
        // если у всех перебор - выиграл крупье
        if (countPlayersInGame() == 0) {
            for (Player p : players) {
                if (p != null && p instanceof Dealer) {
                    System.out.println("ПОБЕДИТЕЛЬ: " + p.getName());
                    p.printHand();
                    return;

                }
            }
        }
        // Если остался один в игре, находим его и печатаем
        if (countPlayersInGame() == 1) {
            for (Player p : players) {
                if (p != null && p.isInGame()) {
                    System.out.println("ПОБЕДИТЕЛЬ: " + p.getName());
                    p.printHand();
                    return;

                }
            }
        }
        // находим балл победителя (тот балл, который ближе всего к 21му)
        int winnerBall = 1;
        for (Player p : players) {
            if (p != null && p.isInGame() && p.countBallsInHand() > winnerBall) {
                winnerBall = p.countBallsInHand();
            }
        }
        // печатаем на консоль тех игроков, у кого балл победителя
        for (Player p : players) {
            if (p != null && p.countBallsInHand() == winnerBall) {
                System.out.println("ПОБЕДИТЕЛЬ: " + p.getName());
                p.printHand();
            }

        }
    }

    private int countPlayersInGame() {
        int count = 0;
        for (Player p : players) {
            if (p != null && p.isInGame()) {
                count++;
            }
        }
        return count;
    }
}