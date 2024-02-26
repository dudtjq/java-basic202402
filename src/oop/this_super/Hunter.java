package oop.this_super;

public class Hunter extends Player {

    String pet;

    Hunter(String name){
        this.name = name;
        this.pet = "쁘띠 스우";
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 펫 이름 : " + pet);
    }
}
