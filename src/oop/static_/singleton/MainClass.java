package oop.static_.singleton;

import static oop.static_.singleton.Singleton.*;

public class MainClass {
    public static void main(String[] args) {

//        Singleton s = new Singleton();

        for (int i = 0; i <1000 ; i++) {

            Singleton s = getInstance();
            s.method1();
            s.method2();
            System.out.println("s = " + s);

        }





















    }

}
