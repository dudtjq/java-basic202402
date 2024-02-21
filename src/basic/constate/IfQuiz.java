package basic.constate;

import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {

        /*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해 주세요 : ");
        int number1 = scan.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요 : ");
        int number2 = scan.nextInt();
        System.out.print("세번째 숫자를 입력해 주세요 : ");
        int number3 = scan.nextInt();

        int max = 0;
        int mid = 0;
        int min = 0;

        if(number1 > number2 && number1 > number3){
            max = number1;
            if(number2 > number3){
                mid = number2;  min = number3;
            }else {
                mid = number3;  min = number2;
            }
        }else if(number2 > number1 && number2 > number3){
            max = number2;
            if(number1 > number3){
                mid = number1;  min = number3;
            }else {
                mid = number3;  min = number1;
            }
        }else {
            max = number3;
            if (number1 > number2){
                mid = number1;  min = number2;
            }else {
                mid = number2;  min = number1;
            }

        }

        System.out.println("min = " + min + " mid = " + mid  + " max = " + max  );


        scan.close();







    }
}
