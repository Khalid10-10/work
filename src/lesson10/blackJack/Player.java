package lesson10.blackJack;

import java.util.Scanner;

public class Player {
    private String name;
    private Card[] hand = new Card[20];
    private boolean inGame = true;


    public Player() {
    }

    public boolean isInGame() {
        return inGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public Player(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null) {
                hand[i] = card;
                break;
            }

        }
    }

    public boolean needMoreCard() {
        System.out.println("----------- ВАШИ КАРТЫ ------------ " + name);
        printHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужна ли вам еще одна карта? (да/нет)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    public void printHand() {
        for (Card c : hand) {
            if (c != null) {
                c.open();

            }

        }
    }

    public int countBallsInHand() {
        int count = 0;
        for (Card c : hand) {
            if (c != null) {
                count = count + c.getBall();
            }
        }
        return count;
    }
}
