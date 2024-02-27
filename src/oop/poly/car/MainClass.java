package oop.poly.car;

public class MainClass {
    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porshe p1 = new Porshe();
        Porshe p2 = new Porshe();
        Porshe p3 = new Porshe();

        Gv80 g1 = new Gv80();
        Gv80 g2 = new Gv80();
        Gv80 g3 = new Gv80();
        Gv80 g4 = new Gv80();

//        s1.run(); s2.run(); s3.run(); p1.run(); p2.run(); p3.run();
//        g1.run(); g2.run(); g3.run(); g4.run();

//        Sonata[] sonatas = {s1, s2, s3};
//        for (Sonata sonata : sonatas) {
//            sonata.run();
//        }

        // 다형성을 적용해서 서로 다른 타입들을 모아 놓울 수 있다.
        Car[] cars = {s1, s2, s3, p1, p2, p3, g1, g2, g3, g4};

        for (Car car : cars) {
            car.run();
        }

        System.out.println("----------------------------");

        Driver kim = new Driver();
        kim.drive(s1);
        kim.drive(g2);
        kim.drive(p3);

        System.out.println("----------------------------");

        Gv80 myGv80 = (Gv80) kim.buyCar("gv80");
        myGv80.run();
        myGv80.activeAutoPilot();
//        Gv80 g = (Gv80) myGv80;
//        g.activeAutoPilot();

        System.out.println("----------------------------");

        CarShop shop = new CarShop();
        shop.carPrice(s2);
        shop.carPrice(g1);
        shop.carPrice(p3);


    }
}
