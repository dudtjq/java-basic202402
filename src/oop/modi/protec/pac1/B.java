package oop.modi.protec.pac1;

public class B {

    A a = new A(30); // protected\
    A a2 = new A(32.14); // default

    public B(){
        a.x = 1;
        a.y = 2;

        a.method1();
        a.method2();

    }

}
