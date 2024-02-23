package oop.inherit.good;

public class MainClass {

    public static void main(String[] args) {

        Warrior w1 = new Warrior();

        w1.name = "세상은날억";
        w1.level = 270;
        w1.atk = 2074;
        w1.hp = 76000;
        w1.rage = 60;
        w1.characterInfo();

        System.out.println("##############################");

        Mage m1 = new Mage();

        m1.name = "세상은마법";
        m1.level = 265;
        m1.atk = 1790;
        m1.hp = 54000;
        m1.mana = 89000;
        m1.characterInfo();

        System.out.println("##############################");

        Hunter h1 = new Hunter();

        h1.name = "세상은사냥";
        h1.level = 260;
        h1.atk = 1650;
        h1.hp = 65000;
        h1.pet = "쁘띠스우";
        h1.characterInfo();


    }
}
