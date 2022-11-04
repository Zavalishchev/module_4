package PracticeWeek;

import java.lang.reflect.Type;

public class Mage {
    public String name;
    public int level;
    public int damage;
    public String type;


    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }
    public String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    public String fight(Mage mage) {
        String res = "";
        if (this.type.equals("fire") && mage.type.equals("ice")) return this.type;
        else if (this.type.equals("ice") && mage.type.equals("fire")) return mage.type;
        else if(this.type.equals("ice") && mage.type.equals("earth")) return this.type;
        else if(this.type.equals("earth") && mage.type.equals("fire")) return this.type;
        else if(this.type.equals(mage.type)) {
            if(this.level > mage.level) return this.name;
            else if (this.damage < mage.damage) return this.name;
            else if (this.damage > mage.damage) return mage.type;
            else return "маги равны";
        }
        return res;
    }

    public static void main(String[] args) {
        Mage mageFire_1 = new Mage("MageFire 1", 50, 10, "fire");
        Mage mageIce_1 = new Mage("Mage Ice 1", 30, 10, "ice");
        System.out.println(mageIce_1.fight(mageFire_1));
    }


}





