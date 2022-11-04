package Plain_Pack;

public class Plain {
    private int x, y, z;
    private int countBombs;
    private int fuel;
    private int dir = 0;

    public Plain() {
        this.x = 100;
        this.y = 100;
        this.z = 100;
        this.fuel = 100;
        this.countBombs = 5;
    }

    public Plain(int x, int y, int z, int countBombs, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.countBombs = countBombs;
        this.fuel = fuel;
    }

    public void flyStraight(int i) {
        switch (dir){
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("что-то пошло не так");
                break;
        }
        this.fuel--;
        if(this.fuel <= 0 && this.z > 0) {
            System.out.println("Лох, закончилось топливо, игра закончилась");
        } else {
            System.out.println("Вы пролетели прямо и находитесь на координатах: x = " + this.x + ", y = " + this.y + ", z = " + this.z + ", топлива осталось: " + this.fuel);
        }
    }

    private void flyStraightNonForPlayer(int i) {
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("что-то пошло не так");
                break;
        }
        fuel--;
    }

    public void flyUp(int up, int i) {
        flyStraightNonForPlayer(i);
        this.z += up;
        if (this.fuel <= 0 && this.z > 0) {
            System.out.println("Лох, закончилось топливо, игра закончилась");
        } else {
            System.out.println("Вы пролетели прямо и находитесь на координатах: x = " + this.x + ", y = " + this.y + ", z = " + this.z + ", топлива осталось: " + this.fuel);
        }
    }

    public void flyDown(int down, int i) {
        flyStraightNonForPlayer(i);
        this.z -= down;
        if (z <= 0) {
            System.out.println("Самолёт приземлился");
        } else {
            System.out.println("Вы пролетели прямо и находитесь на координатах: x = " + this.x + ", y = " + this.y + ", z = " + this.z + ", топлива осталось: " + this.fuel);
        }
    }

    public void fillFuel() {
        if (z > 0) {
            System.out.println("Нельзя заправляться в воздухе");
        } else {
            this.fuel += 100;
            if (this.fuel > 100) {
                this.fuel = 100;
            }
            System.out.println("вы заправилтсь, топлива: " + this.fuel);
        }
    }

    public void dropBombs() {
        if (countBombs < 0) {
            System.out.println("нет бомб");
        } else {
            countBombs--;
            System.out.println("вы сбросили бомбу по координатам: x = " + this.x + ", y = " + this.y + ". Осталось " + this.countBombs + " бомб");
        }
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
        System.out.println("вы повернули налево");
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
        System.out.println("вы повернули на право");
    }
}
