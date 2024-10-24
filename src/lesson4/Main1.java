package lesson4;

public class Main1 {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 50, 9, 2, 5};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
