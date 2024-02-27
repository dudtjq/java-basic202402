package oop.poly.player;

public class Mage extends Player {

    int mana;

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }

    public void blizzard(Player[] targets){
        System.out.println(this.name + "님의 눈보라 시전!");

        this.mana -= 30;

        System.out.println("30의 마나가 소비 됩니다. 남은 마나는 " + this.mana + "입니다.");
        System.out.println("--------------------------------------------");

        for (Player p : targets) {

            if(p == this){
                System.out.println("자신은 공격할수 없습니다.");
                continue;
            }

            // 10 ~ 15 사이의 변수
            int attck = (int) (Math.random() * 6 + 10);

            p.hp -= attck;

            System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력 : %d)\n",
                    this.name, attck, p.hp);

        }


    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나 : " + mana);
    }


}
