// 패키지 선언은 항상 클래스 최 상단에 위치 해야함
package oop.pac;

// 작성중인 패키지와 다른 곳에 위차한 클래스 정보를 불러오려면 import가 필요
//import oop.pac.fruit.Apple;
//import oop.pac.fruit.Banana;
//import oop.pac.fruit.Melon;

import oop.pac.fruit.*; // fruit 패키지의 모든 클래스를 import하겠다.

public class MainClass{

    public static void main(String[] args) {

        // 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
        // 반드시 패키지 경로를 직접 명시해 주어야 함

        Apple a = new Apple();
        oop.pac.juice.Apple a2 = new oop.pac.juice.Apple();

        Banana b = new Banana();

        Melon m = new Melon();


        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
