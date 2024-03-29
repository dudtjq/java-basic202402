package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class  C extends A {

  //  A a1 = new A(30); (x)
//  A a2 = new A(30.22); (x)


    public C() {
        /*
         - protected 제한자는 패키지가 다른 경우
           두 클래스 사이에 상속 관계가 존재한다면
           super 키워드를 통해 참조를 허용함
        */
        super(30); //protected
       // super(3.14); // default

        super.x = 1;
      //  super.y = 2; (x)

        super.method1();
      //  super.method2();
    }
}
