package lesson2;

public class Main9 {
    public static void main(String[] args) {
        for (int number = 50; number <= 500; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
            }
        }
    }
}
