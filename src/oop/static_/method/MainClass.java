package oop.static_.method;

import static util.Utility.*;

public class MainClass {
    public static void main(String[] args) {

    Count c = new Count();

    c.a = 5;
    Count.b = 15;

    int result = c.method1();
    System.out.println("result = " + result);

    int result2 = Count.method2();

    makeLine();

    String name = input("이름을 입력하세요 : ");
    System.out.println("name = " + name);




    }
}
