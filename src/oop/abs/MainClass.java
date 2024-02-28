package oop.abs;

public class MainClass {
    public static void main(String[] args) {


        /*
         - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
          프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
          메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
          구현하기가 편합니다.

         - 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
         */
        
        // 추상 클래스는 스스로에겐 생성이 안됨
        // 하지만, 추상 클래스의 객체가 아예 생성이 안 되는 것이 아니라
        // 자식 객체를 통해 실체화가 가능함.(super())
        
//        Pet p = new Pet("애완동물", "몰라", 5);(x)

        Pet dog = new Dog("구름이","말티즈", 1);
        Cat cat = new Cat("양말이","길냥이", 5);
        GoldFish fish = new GoldFish("잉어킹","잉어", 2);

        Pet[] pets = {dog, cat, fish};

        for (Pet pet : pets) {
            pet.takeNap();
            pet.eat();
            pet.walk();
            // 문자열로 리턴이 되기 때문에 sout으로 처리 해줘야함
            System.out.println(pet.sayHello());
        }



    }
}
