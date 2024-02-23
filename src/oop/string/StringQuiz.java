package oop.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz {

    public static void main(String[] args) {


        /*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. ex)
            921013-1234567 -> 1992년 10월 13일 32세 남자
            960223-2345678 -> 1996년 2월 23일 28세 여자
            031125-3456789 -> 2003년 11월 25일 21세 남자
            031125-4123456 -> 2003년 11월 25일 21세 여자
         */

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.print("주민등록번호를 입력해 주세요 (-) 포함 : ");
            String number = scan.nextLine();

            if(number.indexOf("-") == -1){
                System.out.println("- 포함하여 입력해주세요");
                continue;
            }else if(number.length() < 13){
                System.out.println("주민등록번호가 13자리가 아닙니다.");
                continue;
            }

            number = number.replace("-", "");
            char c = number.charAt(6);

            // 년도 계산이 필요하기 때문에 정수로 전환
            String str1 = number.substring(0, 2);
            int year = Integer.parseInt(str1);
            //System.out.println(year);

            // 굳이 계산이 필요없음 추출만 진행
            String month = number.substring(2, 4);
            //System.out.println(month);

            // 굳이 계산이 필요없음 추출만 진행
            String day = number.substring(4, 6);
            //System.out.println(day);

            if(c == '1' || c == '2'){
                year += 1900;
            }else {
                year += 2000;
            }

            int age = 2024 - year;

            String gender;

            if(c == '1' || c == '3'){
                gender = "남자";
            }else {
                gender = "여자";
            }

            System.out.println(year + "년 " + month + "월 " + day + "일 " + age + "세 " + gender);

            break;

        }
        scan.close();

//        String numbers = number;
//        String[] num = numbers.split("-");
//        System.out.println(Arrays.toString(num));












    }
}
