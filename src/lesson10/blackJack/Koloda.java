package lesson10.blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
private Card[] cards = new Card[52];

public void createKoloda(){
    cards[0] = new Card("2 трефа", 2);
    cards[1] = new Card("2 бубна", 2);
    cards[2] = new Card("2 пика", 2);
    cards[3] = new Card("2 черви", 2);

    cards[4] = new Card("3 трефа", 2);
    cards[5] = new Card("3 бубна", 2);
    cards[6] = new Card("3 пика", 2);
    cards[7] = new Card("3 черви", 2);

    cards[8] = new Card("4 трефа", 2);
    cards[9] = new Card("4 бубна", 2);
    cards[10] = new Card("4 пика", 2);
    cards[11] = new Card("4 черви", 2);

    cards[12] = new Card("5 трефа", 5);
    cards[13] = new Card("5 бубна", 5);
    cards[14] = new Card("5 пика", 5);
    cards[15] = new Card("5 черви", 5);

    cards[16] = new Card("6 трефа", 6);
    cards[17] = new Card("6 бубна", 6);
    cards[18] = new Card("6 пика", 6);
    cards[19] = new Card("6 черви", 6);

    cards[20] = new Card("7 трефа", 7);
    cards[21] = new Card("7 бубна", 7);
    cards[22] = new Card("7 пика", 7);
    cards[23] = new Card("7 черви", 7);

    cards[24] = new Card("8 трефа", 8);
    cards[25] = new Card("8 бубна", 8);
    cards[26] = new Card("8 пика", 8);
    cards[27] = new Card("8 черви", 8);

    cards[28] = new Card("9 трефа", 9);
    cards[29] = new Card("9 бубна", 9);
    cards[30] = new Card("9 пика", 9);
    cards[31] = new Card("9 черви", 9);

    cards[32] = new Card("10 трефа", 10);
    cards[33] = new Card("10 бубна", 10);
    cards[34] = new Card("10 пика", 10);
    cards[35] = new Card("10 черви", 10);

    cards[36] = new Card("Валет трефа", 10);
    cards[37] = new Card("Валет бубна", 10);
    cards[38] = new Card("Валет пика", 10);
    cards[39] = new Card("Валет черви", 10);


    cards[40] = new Card("Дама трефа", 10);
    cards[41] = new Card("Дама бубна", 10);
    cards[42] = new Card("Дама пика", 10);
    cards[43] = new Card("Дама черви", 10);

    cards[44] = new Card("Король трефа", 10);
    cards[45] = new Card("Король бубна", 10);
    cards[46] = new Card("Король пика", 10);
    cards[47] = new Card("Король черви", 10);

    cards[48] = new Card("Туз трефа", 11);
    cards[49] = new Card("Туз бубна", 11);
    cards[50] = new Card("Туз пика", 11);
    cards[51] = new Card("Туз черви", 11);
    }
    public Card rundomCard(){
    int randomNum = ThreadLocalRandom.current().nextInt(0,51 +1);
    return cards[randomNum];
    }

}
