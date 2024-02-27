package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain {
    public static void main(String[] args) {

        /*
         - Score 객체를 담을 수 있는 배열을 선언하세요.
          배열의 크기는 넉넉하게 100개로 하겠습니다.

         - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
         입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
         총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
         (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
         객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
         이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.

         - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
          scoreInfo()를 모두 불러주세요. (반복문)
          주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
          모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
         */

        Scanner scan = new Scanner(System.in);

        // 배열의 길이가 100인 infos 생성
        Score[] infos = new Score[100];

        System.out.println("*** 학생 점수 입력 프로그램 ***");
        System.out.println("이름 입력창에 '그만'을 입력하시면 종료 됩니다.");

       //  배열안에 index의 값을 넣기 위해 초기화
        int idx = 0;
//        while (infos[infos.length-1] == null){
        
            while (idx != infos.length){
            System.out.print("이름을 입력하세요 : ");
            String name = scan.next();

            if(name.equals("그만")){
                System.out.println("입력을 종료 합니다.");
                break;
            }

            Score s = new Score();

            System.out.print("국어점수를 입력하세요 : ");
            int korean = scan.nextInt();

            if(!s.isValidateScore(korean)) continue;

            System.out.print("영어점수를 입력하세요 : ");
            int english = scan.nextInt();

            if(!s.isValidateScore(english)) continue;

            System.out.print("수학점수를 입력하세요 : ");
            int math = scan.nextInt();

            if(!s.isValidateScore(math)) continue;

            s.setName(name);
            s.setKorean(korean);
            s.setEnglish(english);
            s.setMath(math);

            s.setTotalAndAvg();

//            total = korean + english +math;
//            double avg = total / 3.0;
//            s.setTotal(total);
//            s.setAvg(avg);

            // 배열 안에 추가
            infos[idx] = s;
            idx++;

            System.out.println("*** 학생 정보 입력 완료 ***\n");
            
        }// 입력 반복문 끝

        for (Score info : infos) {

            if(info == null){
                break;
            }

            info.scoreInfo();
            System.out.println("--------------------------------");
        }

        scan.close();

//        int total = 0;
//        double avg;
//        for (int i = 0; i <infos.length ; i++) {
//
//            System.out.print("이름을 입력하세요 : ");
//            String name = scan.next();
//
//            if(name.equals("그만")){
//                break;
//            }
//
//            if(name.equals("")){
//                System.out.println("이름을 입력해주세요.");
//            }
//
//            System.out.print("국어점수를 입력하세요 : ");
//            int korean = scan.nextInt();
//
//            if(korean < 0 || korean > 100){
//                System.out.println("0 ~ 100점 사이의 점수를 입력해주세요.");
//                break;
//            }
//
//            System.out.print("영어점수를 입력하세요 : ");
//            int english = scan.nextInt();
//
//            if(english < 0 || english > 100){
//                System.out.println("0 ~ 100점 사이의 점수를 입력해주세요.");
//                break;
//            }
//
//            System.out.print("수학점수를 입력하세요 : ");
//            int math = scan.nextInt();
//
//            if(math < 0 || math > 100){
//                System.out.println("0 ~ 100점 사이의 점수를 입력해주세요.");
//                break;
//            }
//
//            total = korean + english + math;
//            avg = total / 3.0;
//
//            infos[i] = new Score(name, korean, english, math, total, avg);
//        }









    }
}
