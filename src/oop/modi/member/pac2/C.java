package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

    public C(){

        A a1 = new A();
        a1.x = 1; // public
     //   a1.y = 2; // default
      //  a1.z = 5; // private

        a1.method1();
       // a1.method2();   default
       // a1.method3();   private

    }
}
