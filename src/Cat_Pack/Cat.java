package Cat_Pack;

public class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount;

    public Cat() {
        this(3000, "Barsik", 1, "Grey");
    }
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }

    void meow() {
        System.out.println("Meow");
    }
    private void pee() {
        weight -= 20;
    }
    void eat() {
        weight += 50;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public int getCatCount() {
        return catCount;
    }
}
