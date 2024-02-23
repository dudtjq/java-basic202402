package oop.constructor;

public class PhoneMain {
    public static void main(String[] args) {

        Phone info = new Phone();
        info.showSpec();

        System.out.println("-------------------------------");

        Phone galaxy = new Phone("Galaxy S24");
        galaxy.showSpec();

        System.out.println("-------------------------------");

        Phone iphone = new Phone("Iphone 15");
        iphone.showSpec();

        System.out.println("-------------------------------");

        Phone newIphone = new Phone("Iphone 15", "퍼플");
        newIphone.showSpec();



    }
}
