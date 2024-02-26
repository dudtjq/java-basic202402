package oop.obj_arr;

public class MainClass {
    public static void main(String[] args) {

//        Person kim = new Person("김춘식", 32, "남자");
//        Person lee = new Person("이영희", 25, "여자");
//        Person park = new Person("박뽀삐", 50, "남자");
//
//        kim.personInfo();
//        lee.personInfo();
//        park.personInfo();

//        Person[] members = new Person[3];
//        members[0] = new Person("김춘식", 32, "남자");

        Person[] member = {
                new Person("김춘식", 32, "남자"),
                new Person("이영희", 25, "여자"),
                new Person("박뽀삐", 50, "남자")
        };

       // System.out.println(Arrays.toString(member));
//        member[0].personInfo();
//        member[1].personInfo();
//        member[2].personInfo();

//        for (int i = 0; i <member.length ; i++) {
//            member[i].personInfo();
//        }

        for(Person person : member){

            person.personInfo();

        }

    }
}
