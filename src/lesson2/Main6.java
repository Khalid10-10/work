package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // у нас есть 100 тыс рублей
        // сколько денег мы снимем с депозита
        // если положем данные деньги на 7 лет под 17%
        // капитализация ежемесячная и деньги мы не забираем весь срок
        int money = 100000;
        int year = 7;
        int prosent = 17;
        for(int month = 0; month < 12 * year; month++){
            money = money + ((money / 100) * prosent)/12;
        }
        System.out.println(money);
    }
}
