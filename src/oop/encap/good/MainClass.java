package oop.encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyBirth birth = new MyBirth();

//        birth.year = 1996; (x)

        birth.setYear(1996);
        birth.setMonth(4);
        birth.setDay(15);

        birth.birthInfo();

        /*
//      - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
//        캡슐화 라고 합니다. (encapsulation)
//     데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
//        */








    }
}
