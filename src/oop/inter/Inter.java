package oop.inter;

// interface : 객체의 규격(기능)을 표준화 해서 명세하는 역할
public interface Inter {

    // interface 에서 변수를 선언하면 상수(static final)로 인식함
    int NUM = 5;
    
    
//    Inter(){
//        interface는 생성자를 가질 수 없음(객체화 될 수 없는 개념)
//    }

    // interface에서 메서드를 선언 하면 추상 메서드로 지정 됨
    void method1();

    public static void staticMethod(){
        System.out.println("이건 가능함!");
    }
    

}
