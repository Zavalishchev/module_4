package PracticeWeek;

public class Programmer {
    String name;
    String company;
    String position;
    static int posCounter;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
        posCounter++;
    }
    public String getPosition() {
        return position;
    }
    public void work() {
        if (posCounter == 1 && getPosition() == "intern") {
            this.position = "junior";
            posCounter++;
        } else if(posCounter == 2 && getPosition() == "junior") {
            this.position = "middle";
            posCounter++;
        } else if (posCounter == 3 && getPosition() == "middle") {
            this.position = "senior";
            posCounter++;
        } else {
            this.position = "lead";
            posCounter++;
        }
    }

    public static void main(String[] args) {
        Programmer prog = new Programmer("Andrei", "Fanuc");
        System.out.println(prog.getPosition());
        prog.work();
        System.out.println(prog.getPosition());
        prog.work();
        System.out.println(prog.getPosition());
        prog.work();
        System.out.println(prog.getPosition());
        prog.work();
        System.out.println(prog.getPosition());
    }
}
