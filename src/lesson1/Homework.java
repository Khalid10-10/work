package lesson1;

public class Homework {
    public static void main(String[] args) {
        int money = 1000;
        int countSnikers = money / 35;
        int countKonfet = (int) (money % 35 / 3.5);
        double sdacha = money % 35 % 3.5;
        System.out.println("Кол-во купленных сникерсов: " + countSnikers);
        System.out.println("Кол-во купленных конфет: " + countKonfet);
        System.out.println("Сдача: " + sdacha);

    }
}
