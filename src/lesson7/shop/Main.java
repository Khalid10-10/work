package lesson7.shop;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setLevel(5);
        user.setUserName("Пришелец-JN52355");
        user.setPathToImage("С://qwerty//mfdf.jpg");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setReiting(4);
        otziv.setDostoinstva("Очень тихий фен");
        otziv.setNedostatki("Цена не очень");
        otziv.setComments("В целом, мне понравился товар");

        System.out.println(otziv);
    }
}
