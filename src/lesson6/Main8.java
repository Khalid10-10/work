package lesson6;

public class Main8 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше и лучше";

        StringBuilder result = new StringBuilder();

        for (char c : text.toLowerCase().toCharArray()) {
            if ("аеёиоуыэюя".indexOf(c) != -1) {
                result.append(Character.toUpperCase(c));
            }
        }

        System.out.println(result);



    }
}