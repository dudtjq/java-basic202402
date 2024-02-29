package etc.api.leng.obj;

public class MainClass {
    public static void main(String[] args) {

    Person kim = new Person("김춘식", 30);

    Person hong = new Person("홍길동", 25);

    // 객체 타입의 변수를 출력하거나 값을 얻을 때는
    // 뒤에 자동으로 .toString() 이 붙어서 진행됨 (Object가 물려주는 메서드)
    System.out.println(kim);
    System.out.println(hong);


    if(kim.equals(hong)){
        System.out.println("이름과 나이가 같네요");
    }else {
        System.out.println("이름이 다를 수도, 나이가 다를 수도, 둘다 다를 수도...");
    }


    // finalize는 gc 를 호출되는 순서가 보장되지 않기 때문에
    // 사용이 권장되지 않습니다.
//    hong = null;
//    kim = null;
//    System.gc(); // 가비지 컬렉터를 호출. (부른다고 바로 안 올 수도 있음)

    Person park = new Person("박복제인간", 100);

   // Person clonePerson = park;
        try {
            Person clonePerson = (Person) park.clone();
            System.out.println("복사된 객체 정보 : " + clonePerson);
            park.setName("박영희");
            System.out.println(park);
            System.out.println(clonePerson);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
