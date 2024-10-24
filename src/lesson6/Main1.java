package lesson6;

public class Main1 {
    public static void main(String[] args) {
        String text = "Я учусь на разработчика java";
       char[] simbols = text.toCharArray();
       for(int i = 0; i < simbols.length; i+=2){
           System.out.println(simbols[i]);

       }
    }
}
