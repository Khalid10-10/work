package lesson7;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String poneNumber;

    public void setAge(int age ){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPoneNumber() {
        return poneNumber;
    }

    public void setPoneNumber(String poneNumber) {
        this.poneNumber = poneNumber;
    }
}
