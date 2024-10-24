package lesson5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры: ");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        switch (level) {
            case 1:
                int[][] field = new int[9][9];
                for (int mine = 0; mine < 10; mine++) {
                    int i = ThreadLocalRandom.current().nextInt(0, 8 + 1);
                    int j = ThreadLocalRandom.current().nextInt(0, 8 + 1);
                    if (field[i][j] == -1) {
                        mine--;
                    }
                    field[i][j] = -1;
                }
                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field[i].length; j++) {
                        System.out.print(field[i][j] + " ");

                    }
                    System.out.println();

                }
                break;
            case 2:
                int[][] field2 = new int[16][16];
                for (int mine = 0; mine < 40; mine++) {
                    int i = ThreadLocalRandom.current().nextInt(0, 15 + 1);
                    int j = ThreadLocalRandom.current().nextInt(0, 15 + 1);
                    if (field2[i][j] == -1) {
                        mine--;

                    }
                    field2[i][j] = -1;
                }
                for (int i = 0; i < field2.length; i++) {
                    for (int j = 0; j < field2[i].length; j++) {
                        System.out.print(field2[i][j] + " ");

                    }
                    System.out.println();
                }
                break;
            case 3:
                int[][] field3 = new int[16][30];
                for (int mine = 0; mine < 99; mine++) {
                    int i = ThreadLocalRandom.current().nextInt(0, 15 + 1);
                    int j = ThreadLocalRandom.current().nextInt(0, 29 + 1);
                    if (field3[i][j] == -1) {
                        mine--;
                    }
                    field3[i][j] = -1;

                }
                for (int i = 0; i < field3.length; i++) {
                    for (int j = 0; j < field3[i].length; j++) {
                        System.out.print(field3[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Введите количество строк:");
                int stroka = scanner.nextInt();
                System.out.println("Введите количество колонок:");
                int kolonka = scanner.nextInt();
                System.out.println("Укажите количество мин:");
                int mines = scanner.nextInt();
                int[][] field4 = new int[stroka][kolonka];
                for(int mine = 0; mine < mines; mine++){
                    int i = ThreadLocalRandom.current().nextInt(0, field4.length);
                    int j = ThreadLocalRandom.current().nextInt(0, field4[i].length);
                    if (field4[i][j] == -1) {
                        mines--;
                    }
                    field4[i][j] = -1;

                }
                for (int i = 0; i < field4.length; i++) {
                    for (int j = 0; j < field4[i].length; j++) {
                        System.out.print(field4[i][j] + " ");

                    }
                    System.out.println();

                }
                break;

        }
    }
}
