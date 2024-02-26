package oop.overloading;

public class Calculator {

    /*
     # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
      생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.

     - 오버로딩 적용 조건:
     1. 매개 변수의 데이터 타입이 다를 것! or
     2. 매개 변수의 전달 순서가 다를 것! or
     3. 매개 변수의 개수가 다를 것.
     */

    void inputData(){}

    void inputData(int a){}

    void inputData(int a, int b){}

    //void inputData(int b, int a){}((x)

    void inputData(String s){}

    void inputData(int a, double b){}

    void inputData(double b, int a){}

   // void inputData(int number){} (x) 정수 매개값 1개를 받는 메서드 이미 선언됨

//    int inputData(int number){
//        return 0;
//    } (x) 반환 유형(return type) 은 오버로딩에 영향을 미치지 못합니다.


    int calcRectArea(int length1){
       return length1 * length1;
    }


    int calcRectArea(int length1 , int length2){
        return length1 * length2;
    }

    double calcRectArea(int length1 , int length2, int length3){
        return (length1 + length2) * length3 / 2.0;
    }

}
