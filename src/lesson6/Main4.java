package lesson6;

public class Main4 {
    public static void main(String[] args) {
        String email = "alex.qwerty@gmail.ru";
        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length != 2) {
            System.out.println("В email нет собачек, или их больше чем 2");
            return;
        }
        if(email.endsWith(".") || email.startsWith(".") ){
            System.out.println("Email не может начинаться или заканчиваться на точку");
            return;

        }
        if (!partsOfEmail[1].contains(".")) {
            System.out.println("Часть после @ не содержит точки!!!");
        }
        else {
            System.out.println("Email нам полностью подходит");
        }

    }
}
