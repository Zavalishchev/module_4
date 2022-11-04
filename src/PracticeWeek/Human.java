package PracticeWeek;

public class Human {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String work;

    static final int ageDefalt = 35;
    static final int weightDefault = 65;
    static final String nameDefault = "ANDREI";

    public Human(String name, int age) {
        this(name, age, ageDefalt, null, null);
    }
    public Human(String name, String address) {
        this(name, ageDefalt, weightDefault, address, null);
    }
    public Human(String name, int age, int weight) {
        this(name, age, weight, null, null);
    }
    public Human(String name, int age, String work) {
        this(name, age, weightDefault, null, work);
    }
    public Human(int age, int weight, String address, String work) {
        this(nameDefault, age, weight, address, work);
    }
    public Human(String name, int age, int weight, String address, String work) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
