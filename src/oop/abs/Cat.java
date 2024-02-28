package oop.abs;

public class Cat extends Pet{

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이는 캣타워 에서 쿨쿨쿨");
    }

    @Override
    public void eat() {
        System.out.println("냥이가 연어를 냠냠냠");
    }

    @Override
    public void walk() {
        System.out.println("고양이는 산책이 필수는 아닙니다.");
    }
}
