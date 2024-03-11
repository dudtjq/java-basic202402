package test;

import java.util.*;

public class Test {

    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };

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

//        Scanner scan = new Scanner(System.in);
//        System.out.print("조회 할 과목명을 입력하세요 : ");
//        String name = scan.nextLine();
//
//        if(scoreMap.containsKey(name)){
//            System.out.println(name + " : " + scoreMap.get(name));
//        }else {
//            System.out.println("존재 하지 않는 과목 입니다.");
//        }

        for (String subject : scoreMap.keySet()) {
                if(scoreMap.get(subject) >= 90){
                    System.out.print(subject + " ");
                }


        }
        System.out.println();


        for (String subject : scoreMap.keySet()) {
            if(scoreMap.get(subject) == 100){
                System.out.println("수상 가능");
            }
        }

        Map<String, String> nameMap = new HashMap<>();

        nameMap.put("유재석", "X");
        nameMap.put("박나래", "X");
        nameMap.put("이지은", "X");
        nameMap.put("서장훈", "X");
        nameMap.put("이광수", "X");

        //System.out.println(nameMap);

        for (String name : nameMap.keySet()) {

            if(name.startsWith("이")) {
                nameMap.put(name, "O");
            }

        }
        System.out.println(nameMap);

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것

        int score = 0;
        for (int i = 0; i < 5; i++) {

            String randCountry = keyList.get(rand.nextInt(keyList.size()));

            System.out.print(randCountry + " 수도의 이름은?");
            String country = scan.nextLine();

            if(country.equals(capitalMap.get(randCountry))){
                    score += 20;
                System.out.println("정답입니다.");
            }else {
                System.out.println("오답입니다.");
            }
        }
        System.out.println("총 점수는 " + score + " 입니다.");













    }
}
