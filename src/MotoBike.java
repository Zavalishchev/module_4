public class MotoBike {

    public String model;
    public int yearMade;
    public String color;

    public MotoBike() {
        this("Kawasaki", 1965, "black");
    }
    public MotoBike(String model, int yearMade, String color) {
        this.model = model;
        this.yearMade = yearMade;
        this.color = color;
    }

    public static void main(String[] args) {
        MotoBike ducati = new MotoBike("Scrambler", 2016, "black-yellow");
        System.out.println(ducati.model);
        System.out.println(ducati.yearMade);
        System.out.println(ducati.color);
    }

    public String getModel() {
        return model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public String getColor() {
        return color;
    }
}
