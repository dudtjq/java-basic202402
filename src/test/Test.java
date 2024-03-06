package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("국어", 90);
        scoreMap.put("수학", 85);
        scoreMap.put("영어", 90);
        scoreMap.put("사회", 80);
        scoreMap.put("과학", 100);

        System.out.println(scoreMap);

        scoreMap.put("사회", 85);

        System.out.println(scoreMap);

        Scanner scan = new Scanner(System.in);
        System.out.print("조회 할 과목명을 입력하세요 : ");
        String name = scan.nextLine();

        if(scoreMap.containsKey(name)){
            System.out.println(name + " : " + scoreMap.get(name));
        }else {
            System.out.println("존재 하지 않는 과목 입니다.");
        }









    }
}
