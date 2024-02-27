package oop.poly.car;

public class Driver {

    public void drive(Car c){
        System.out.println("운전을 시작합니다!");
        c.run();
    }

    public Car buyCar(String name){
        if(name.equals("소나타")){
            System.out.println("소나타(를) 구입합니다.");
            return new Sonata();
        }else if(name.equals("gv80")){
            System.out.println("gv80을 구입합니다.");
            return new Gv80();
        }else if(name.equals("포르쉐")){
            System.out.println("포르쉐를 구입합니다.");
            return new Porshe();
        }else {
            System.out.println("뭐 달라고~~");
            return null;
        }

    }

}
