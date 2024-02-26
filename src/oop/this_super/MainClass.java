package oop.this_super;

public class MainClass {

    public static void main(String[] args) {


        Player p1 = new Player();
        p1.name = "세상은날억";
        p1.characterInfo();

        System.out.println("-------------------------------------");

        Player p2 = new Player("플레이어2");
        p2.characterInfo();

        System.out.println("-------------------------------------");

        Player p3 = new Player("플레이어3", 150);
        System.out.println( "main 에서 p3의 주소값" + p3);
        p3.characterInfo();

        System.out.println("----------------------------------------");

        p1.attack(p2);
        p2.attack(p3);
        p3.attack(p1);

        System.out.println("----------------------------------------");

        Warrior w1 = new Warrior("쉽엉");
        w1.characterInfo();

        System.out.println("----------------------------------------");

        Mage m1 = new Mage("매지셩");
        m1.characterInfo();

        System.out.println("----------------------------------------");

        Hunter h1 = new Hunter("헌텅");
        h1.characterInfo();




















    }

}
