package lesson6;

public class Main2 {
    public static void main(String[] args) {

        String password = "hЙhhh2hhhhh";
        if (password.length() < 8) {
            System.out.println("Пароль меньше 8 символов!!!");
            return;
        }
        if (!password.contains("0") && !password.contains("1")
        && !password.contains("2") && !password.contains("3")
        && !password.contains("4") && !password.contains("5")
        && !password.contains("6") && !password.contains("7")
        && !password.contains("8") && !password.contains("9")) {
            System.out.println("Пароль не содержит цифр!!!");
            return;
        }
        String alfabet = "абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz";
        String alfabetUpper = alfabet.toUpperCase();

        int countUpper = 0;

        for(int i = 0; i < password.length(); i++){

            char ch = password.charAt(i);
            if(alfabetUpper.contains(ch + "")){
                countUpper++;
            }

        }
        if(countUpper == 0){
            System.out.println("Пароль не содержит большую букву!!!");

        } else {
            System.out.println("УРА!!! Пароль нам подходит!");
        }
    }
}
