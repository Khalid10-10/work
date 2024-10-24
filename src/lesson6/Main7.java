package lesson6;

public class Main7 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше и лучше";
        int count = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if ("ауоиэыяюеё".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}