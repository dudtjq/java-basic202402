package oop.fianal_.field;

public class MainClass {
    public static void main(String[] args) {
        
        Person p = new Person("김철수");

        //p.name = "김마이클"; (x)
       // p.nation = "미국"; (x)
        p.age = 30;

        Person p2 = new Person("박영희");

//        p2.nation = "영국"; (x)
//        p2.name = "박영국"; (x)
        p2.age = 31;
        
        
        
        
    }
}
