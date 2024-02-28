package oop.abs;

public class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("금붕어는 물속에서 알파 수면 상태로 잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("금붕어가 사료를 맛나게 받아 먹습니다.");
    }


}
