package lesson18;

public class Person {
    private int age;

    public void setAge(int age) throws UncurrentAgeException {
        if(age < 0){
            throw new UncurrentAgeException("Возраст не может быть меньше 0");
        }
        if(age > 150){
            throw new UncurrentAgeException("Возарст не может быть больше 150");
        }
        this.age=age;
    }
}
